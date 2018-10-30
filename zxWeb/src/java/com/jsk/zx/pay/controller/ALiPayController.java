package com.jsk.zx.pay.controller;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayFundTransToaccountTransferModel;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayFundTransToaccountTransferRequest;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayFundTransToaccountTransferResponse;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.login.service.IUserService;
import com.jsk.zx.pay.model.AlipayConfig;
import com.jsk.zx.pay.service.IPaySucceedNewsSaveService;
import com.jsk.zx.pay.service.IPayUpdateOrderAndUser;
import com.jsk.zx.person.model.JskPersonOrder;
import com.jsk.zx.person.model.JskPersonTransferDetail;
import com.jsk.zx.person.model.ResuUtil;
import com.jsk.zx.person.service.IPersonTransferDetailService;

@Controller
@RequestMapping("/alipay")
public class ALiPayController extends BaseController {

	@Autowired
	private IPayUpdateOrderAndUser payUpdateService;
	@Autowired
	private IPersonTransferDetailService transferDetailService;
	@Autowired
	private IUserService userService;
	@Autowired
	private IPaySucceedNewsSaveService newsSaveService;

	@RequestMapping("/pay")
	@ResponseBody
	public String aliPay(String orderId) throws UnsupportedEncodingException {
		ResuUtil resu = new ResuUtil();
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.URL,
				AlipayConfig.APPID, AlipayConfig.RSA_PRIVATE_KEY, "json",
				AlipayConfig.CHARSET, AlipayConfig.ALIPAY_PUBLIC_KEY, "RSA2");

		JskPersonOrder order = payUpdateService
				.findPersonOrderByOrderId(orderId);
		String amount = order.getPrice().toString();
		System.out.println(amount);
		// TODO Auto-generated catch block
		// 实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
		AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();

		// SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)。
		AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();

		model.setSubject("服装");
		model.setOutTradeNo(order.getPkId());
		model.setTotalAmount(amount);
		model.setProductCode("QUICK_MSECURITY_PAY");
		request.setNotifyUrl(AlipayConfig.return_url);// 回调地址
		request.setBizContent("{" +"\"out_trade_no\":\""+order.getPkId()+"\"," +"\"total_amount\":\""+amount+"\"," +"\"subject\":\""+order.getType()+"\"," +"\"product_code\":\"QUICK_MSECURITY_PAY\"" +"}");//设置业务参数);
		request.setBizModel(model);
		String orderInfo = null;
		try {
//			 这里和普通的接口调用不同，使用的是sdkExecute
			AlipayTradeAppPayResponse response = alipayClient
					.sdkExecute(request);
		 response.getBody();//就是orderString 可以直接给客户端请求，无需再做处理。
			orderInfo = response.getBody();
			resu.setStatus(0);
			resu.setMsg("ok");
			resu.setData(orderInfo);
			return JSON.toJSONString(resu);
		} catch (AlipayApiException e) {
			logger.error(e.getMessage(), e);
		}
		resu.setStatus(0);
		resu.setMsg("创建订单支付失败");
		return JSON.toJSONString(resu);
	}

	@RequestMapping("/aliscallbacks")
	@ResponseBody
	public String notify(HttpServletRequest request,
			HttpServletResponse Response) throws Exception {
		// 获取支付宝POST过来反馈信息
		Map<String, String> params = new HashMap<String, String>();
		Map requestParams = request.getParameterMap();
		ResuUtil resu = new ResuUtil();
		for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			// 乱码解决，这段代码在出现乱码时使用。
			// valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}
		// 获取支付宝的通知返回参数
		// 商户订单号
		String out_trade_no = new String(request.getParameter("out_trade_no")
				.getBytes("ISO-8859-1"), "UTF-8");
		// 交易金额
		String invoice_amount = new String(request.getParameter(
				"invoice_amount").getBytes("ISO-8859-1"), "UTF-8");
		String tradeStatus = request.getParameter("trade_status");
		// 切记alipaypublickey是支付宝的公钥，请去open.alipay.com对应应用下查看。
		// boolean AlipaySignature.rsaCheckV1(Map<String, String> params, String
		// publicKey, String charset, String sign_type)
		boolean flag = false;
		try {
			flag = AlipaySignature.rsaCheckV1(params,
					AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.CHARSET,
					"RSA2");
			if (flag) {
				if ("TRADE_SUCCESS".equals(tradeStatus)) {
					JskPersonOrder order = payUpdateService
							.findPersonOrderByOrderId(out_trade_no);
					payUpdateService.updateOrderById(out_trade_no, "1");
					payUpdateService.updateUserMarket(order.getUserId(),
							Integer.parseInt(invoice_amount),Integer.parseInt(invoice_amount));
					String pkId = order.getPkId();
					Integer userId = order.getUserId();
					String type = order.getType();
					newsSaveService.savePaySuccedNews(pkId, type, userId);
					resu.setStatus(0);
					resu.setMsg("ok");
					return JSON.toJSONString(resu);
				}
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		resu.setStatus(1);
		resu.setMsg("支付失败");
		return JSON.toJSONString(resu);
	}

	@RequestMapping("/transfer")
	@ResponseBody
	public String aliTransfer(Integer pkId) {
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.URL,
				AlipayConfig.APPID, AlipayConfig.RSA_PRIVATE_KEY,
				AlipayConfig.FORMAT, AlipayConfig.CHARSET,
				AlipayConfig.ALIPAY_PUBLIC_KEY, AlipayConfig.SIGNTYPE);
		AlipayFundTransToaccountTransferRequest request = new AlipayFundTransToaccountTransferRequest();
		AlipayFundTransToaccountTransferModel model = new AlipayFundTransToaccountTransferModel();
		JskPersonTransferDetail transferDetail = transferDetailService
				.findByTrancsferDetail(pkId);
		model.setOutBizNo(transferDetail.getOrderId());
		model.setPayeeType("ALIPAY_LOGONID");
		model.setPayeeAccount(transferDetail.getTransferName());
		model.setAmount("" + transferDetail.getMoney());
		model.setPayerShowName("jskzhuanngxiuweixin@163.com");
		model.setRemark("大时圈客户提现");
		request.setBizModel(model);
		// request.setBizContent("{" +
		// "\"out_biz_no\":\"3142321423436\"," +
		// "\"payee_type\":\"ALIPAY_LOGONID\"," +
		// "\"payee_account\":\"435955924@qq.com\"," +
		// "\"amount\":\"100.00\"," +
		// "\"payer_show_name\":\"提现\"," +
		// "\"payee_real_name\":\"徐康康\"," +
		// "\"remark\":\"转账备注\"" +
		// "}");
		AlipayFundTransToaccountTransferResponse response;
		try {
			response = alipayClient.execute(request);
			if (response.isSuccess() && "1000".equals(response.getCode())) {
				transferDetail.setType("2");
				ResuUtil resu = transferDetailService.updatePersonTrancsferDetailByType(
						transferDetail.getUserId(), transferDetail.getType());
				System.out.println("提现调用成功");
				return JSON.toJSONString(resu);
			} else {
				System.out.println("提现调用失败");
			}
		} catch (AlipayApiException e) {
			logger.error(e.getMessage(), e);
		}
		transferDetail.setType("0");
		ResuUtil resu = transferDetailService.updatePersonTrancsferDetailByType(
				transferDetail.getUserId(), transferDetail.getType());
		return JSON.toJSONString(resu);
	}
}
