/**
 * 
 */

package com.jsk.zx.person.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jsk.base.service.BaseService;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.common.Arith;
import com.jsk.zx.person.mapper.JskIndexProductMapper;
import com.jsk.zx.person.mapper.JskIndexServiceMapper;
import com.jsk.zx.person.mapper.JskPersonAddressMapper;
import com.jsk.zx.person.mapper.JskPersonMarketMapper;
import com.jsk.zx.person.mapper.JskPersonOrderDetailMapper;
import com.jsk.zx.person.mapper.JskPersonOrderMapper;
import com.jsk.zx.person.mapper.JskPersonShopMapper;
import com.jsk.zx.person.model.JskIndexProduct;
import com.jsk.zx.person.model.JskIndexService;
import com.jsk.zx.person.model.JskPersonMarket;
import com.jsk.zx.person.model.JskPersonOrder;
import com.jsk.zx.person.model.JskPersonOrderDetail;
import com.jsk.zx.person.model.JskPersonShop;
import com.jsk.zx.person.model.Order;
import com.jsk.zx.person.model.ResuUtil;
import com.jsk.zx.person.service.IPersonOrderService;

@Service("personOrderServiceImpl")
public class PersonOrderServiceImpl extends BaseService implements
		IPersonOrderService {

	@Autowired
	private JskPersonOrderMapper personOrderMapper;
	@Autowired
	private JskPersonShopMapper shopMapper;
	@Autowired
	private JskPersonAddressMapper addressMapper;
	@Autowired
	private JskPersonOrderDetailMapper orderDetailMapper;
	@Autowired
	private JskIndexServiceMapper serviceMapper;
	@Autowired
	private JskIndexProductMapper productMapper;
	@Autowired
	private JskPersonMarketMapper marketMapper;

	@Override
	public ResultUtil findOrderById(Integer userId, String status)
			throws Exception {
		ResultUtil retu = new ResultUtil();
		List<JskPersonOrder> list = new ArrayList<>();
		if (userId != null && status != null) {
			List<?> listProductRecordId = personOrderMapper
					.selectProductRecordId(userId);// 通过用户ID查询查询用户索创建的商品ID
			for (int i = 0; i < listProductRecordId.size(); i++) {
				int recordId = (Integer) listProductRecordId.get(i);
				String type = "1";
				List<JskPersonOrder> productList = personOrderMapper
						.findProductOrderByRecordId(recordId, type, status);// 根据商品id和类型查询订单信息
				list.addAll(productList);
			}
			List<?> listServiceRecordId = personOrderMapper
					.selectServiceRecordId(userId);// 根据用户ID查询用户所创建的服务
			for (int i = 0; i < listServiceRecordId.size(); i++) {
				int recordId = (Integer) listServiceRecordId.get(i);
				String type = "2";
				List<JskPersonOrder> serviceList = personOrderMapper
						.findServiceOrderByRecordId(recordId, type, status);// 根据服务id和类型查询订单信息
				list.addAll(serviceList);
			}
		}

		/*
		 * List<?> listMarketRecordId = personOrderMapper
		 * .selectMarketRecordId(userId); for (int i = 0; i <
		 * listMarketRecordId.size(); i++) { int recordId = (int)
		 * listMarketRecordId.get(i); String type = "3"; List<JskPersonOrder>
		 * marketList = personOrderMapper .findOrderByRecordId(recordId, type);
		 * list.addAll(marketList); }
		 */
		list = ListSortByTime(list);
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有订单");
		}
		return retu;
	}

	// list中的元素按时间排序
	private static List<JskPersonOrder> ListSortByTime(List<JskPersonOrder> list) {
		Collections.sort(list, new Comparator<JskPersonOrder>() {
			@Override
			public int compare(JskPersonOrder o1, JskPersonOrder o2) {
				Date dt1 = o1.getCreateTime();
				Date dt2 = o2.getCreateTime();
				if (dt1.getTime() > dt2.getTime()) {
					return -1;
				} else if (dt1.getTime() < dt2.getTime()) {
					return 1;
				} else {
					return 0;
				}
			}
		});
		return list;
	}

	@Override
	public ResultUtil findPersonServiceOrderById(int userId) throws Exception {
		ResultUtil retu = new ResultUtil();
		List<JskPersonOrder> list = new ArrayList<>();
		list.addAll(personOrderMapper.findServiceOrderById(userId));
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有动态");
		}
		return retu;
	}

	@Override
	public ResultUtil findPersonOrderById(int userId, String status)
			throws Exception {
		ResultUtil retu = new ResultUtil();

		List<JskPersonOrder> list = personOrderMapper.findPersonOrderById(
				userId, status);
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有订单");
		}
		return retu;
	}

	@Override
	public ResuUtil detailOrder(Integer id, String type, String ids) {
		Order order = new Order();
		ResuUtil resu = new ResuUtil();
		Date date = new Date();
		float price = 0;
		List<JskPersonOrderDetail> list = new ArrayList<JskPersonOrderDetail>();
		JskPersonOrderDetail orderDetail;
		String[] strings = ids.split(",");
		String dd = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
		int y = (int) ((Math.random() * 9 + 1) * 100000);
		String pkId = dd + y;
		order.setPkId(pkId);
		order.setUserId(id);
		order.setType(type);
		//List<JskPersonAddress> addressList = addressMapper.selectByUserKey(id);
		List<JskPersonShop> shopList = shopMapper.findByInPkId(strings);
		// 吧购物车信息放到订单详细里
		for (int i=0; i<shopList.size();i++) {
			orderDetail = new JskPersonOrderDetail();
			orderDetail.setRecordName(shopList.get(i).getRecordName());
			orderDetail.setRecordPrice(shopList.get(i).getRecordPrice());
			orderDetail.setRecordPhoto(shopList.get(i).getRecordPhoto());
			orderDetail.setRecordId(shopList.get(i).getRecordId());
			orderDetail.setPayNum(shopList.get(i).getPayNum());
			orderDetail.setPrice(shopList.get(i).getPayNum()
					* shopList.get(i).getRecordPrice());
			orderDetail.setOrderId(pkId);
			orderDetail.setCreateTime(date);
			orderDetail.setUpdateTime(date);
			list.add(orderDetail);
			price += orderDetail.getPrice();
			orderDetailMapper.saveOrderDetailSelective(orderDetail);
		}
		order.setPrice(price);
		order.setCreateTime(date);
		order.setUpdateTime(date);
		personOrderMapper.saveOrder(order);
		order.setOrderDetailList(list);
		//order.setAddress(addressList);
		resu.setStatus(0);
		resu.setMsg("ok");
		resu.setData(order);
		return resu;
	}

	@Override
	public ResuUtil saveOrder(JskPersonOrder order,
			List<JskPersonOrderDetail> orderDetail) {
		ResuUtil resu = new ResuUtil();
		order.setStatus("0");
		// 生成订单号
		String dd = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
		int i = (int) ((Math.random() * 9 + 1) * 100000);
		String pkId = dd + i;
		order.setPkId(pkId);
		personOrderMapper.saveOrder(order);
		// 插入订单明细
		for (JskPersonOrderDetail jskPersonOrderDetail : orderDetail) {
			jskPersonOrderDetail.setOrderId(pkId);
			jskPersonOrderDetail.setCreateTime(order.getCreateTime());
			jskPersonOrderDetail.setUpdateTime(order.getCreateTime());
			orderDetailMapper.saveOrderDetailSelective(jskPersonOrderDetail);
		}
		resu.setStatus(0);
		resu.setMsg("ok");
		resu.setData(i);
		return resu;
	}

	@Override
	public ResuUtil updateOrder(Integer orderId, String status) {
		ResuUtil resu = new ResuUtil();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pkId", orderId);
		map.put("status", status);
		int i = personOrderMapper.updateOrder(map);
		if (i > 0) {
			resu.setStatus(0);
			resu.setMsg("ok");
			return resu;
		}
		resu.setStatus(1);
		resu.setMsg("失败");
		return resu;
	}

	@Override
	public ResultUtil findWorkTypeByRecordId(int recordId) {
		ResultUtil retu = new ResultUtil();
		List<JskPersonOrderDetail> list = orderDetailMapper
				.findWorkTypeByRecordId(recordId);

		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有订单");
		}
		return retu;

	}

	@Override
	public ResultUtil findServiceOrderDetailByRecordId(int recordId) {
		ResultUtil retu = new ResultUtil();
		List<JskPersonOrderDetail> list = orderDetailMapper
				.findServiceOrderDetailByRecordId(recordId);
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有订单");
		}
		return retu;
	}

	@Override
	public ResultUtil insertExpressIntoOrder(Integer pkId, String express,
			String expressType) {
		ResultUtil retu = new ResultUtil();
		int i = personOrderMapper.updateOrderExpressById(pkId, express,
				expressType);
		if (i == 1) {
			retu.setId(0);
			retu.setMsg("插入地址成功");
		} else {
			retu.setId(1);
			retu.setMsg("插入地址失败");
		}
		return retu;
	}

	@Override
	public ResuUtil saveRapidOrder(String type, Integer recordId, Integer num,
			Integer userId) {
		ResuUtil resu = new ResuUtil();
		JskPersonOrderDetail orderDetail = new JskPersonOrderDetail();
		String string = "";
		if (!StringUtils.isEmpty(type) || !StringUtils.isEmpty(recordId)) {
			if ("1".equals(type)) {
				JskIndexService record = serviceMapper
						.selectByPrimaryKey(recordId);
				orderDetail.setRecordName(record.getTitle());
				orderDetail.setRecordPrice(record.getPrice());
				orderDetail.setRecordPhoto(record.getJskSysAnnex()
						.getFilePath());
				orderDetail.setRecordId(record.getPkId());
				orderDetail.setPayNum(num);
				orderDetail.setPrice(record.getPrice());
				float numModel = (float) (Arith.mul(num, record.getPrice()));
				string = saveOrderId(userId, orderDetail, type, numModel);
			}
			if ("2".equals(type)) {
				JskIndexProduct record = productMapper
						.selectByPrimaryKey(recordId);
				orderDetail.setRecordName(record.getTitle());
				orderDetail.setRecordPrice(record.getPrice());
				orderDetail.setRecordPhoto(record.getJskSysAnnex()
						.getFilePath());
				orderDetail.setRecordId(record.getPkId());
				orderDetail.setPayNum(num);
				orderDetail.setPrice(record.getPrice());
				float numModel = (float) (Arith.mul(num, record.getPrice()));
				string = saveOrderId(userId, orderDetail, type, numModel);
			}
			if ("3".equals(type)) {
				JskPersonMarket record = marketMapper
						.selectMarketByPrimaryKey(recordId);
				orderDetail.setRecordName(record.getTitle());
				orderDetail.setRecordPrice(record.getPrice());
				orderDetail.setRecordPhoto(record.getJskSysAnnex().get(0)
						.getFilePath());
				orderDetail.setRecordId(record.getPkId());
				orderDetail.setPayNum(num);
				orderDetail.setPrice(record.getPrice());
				float numModel = (float) (Arith.mul(num, record.getPrice()));
				string = saveOrderId(userId, orderDetail, type, numModel);
			}
			if ("插入失败".equals(string)) {
				resu.setStatus(1);
				resu.setMsg("失败");
				return resu;
			}
			resu.setStatus(0);
			resu.setMsg("ok");
			resu.setData(string);
			return resu;
		}
		resu.setStatus(2);
		resu.setMsg("数据为空");
		return resu;
	}

	private String saveOrderId(Integer userId,
			JskPersonOrderDetail orderDetail, String type, float numModel) {
		JskPersonOrder order = new JskPersonOrder();
		order.setStatus("0");
		// 生成订单号
		String dd = new SimpleDateFormat("yyMMddHHmmss").format(new Date());
		int i = (int) ((Math.random() * 9 + 1) * 100000);
		String pkId = dd + i;
		order.setPkId(pkId);
		order.setUserId(userId);
		order.setType(type);
		order.setPrice(numModel);
		order.setCreateTime(new Date());
		if ("1".equals(type)) {
			order.setPayType("2");
		}
		if ("2".equals(type)) {
			order.setPayType("1");
		}
		if ("3".equals(type)) {
			order.setPayType("3");
		}
		// 插入订单明细
		int k = 0;
		int j = 0;
		try {
			j = personOrderMapper.saveOrder(order);
			orderDetail.setOrderId(pkId);
			orderDetail.setCreateTime(order.getCreateTime());
			orderDetail.setUpdateTime(order.getCreateTime());
			k = orderDetailMapper.saveOrderDetailSelective(orderDetail);
			if (j < 0 || k < 0) {
				return "插入失败";
			}
			return pkId;
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (j < 0 || k < 0) {
			return "插入失败";
		}
		return "插入失败";
	}

	@Override
	public ResuUtil updAddressId(String orderId, Integer addressId) {
		Map<String, Object> map = new HashMap<String, Object>();
		ResuUtil resu = new ResuUtil();
		if(!StringUtils.isEmpty(orderId) && !StringUtils.isEmpty(addressId)){
			map.put("addressId", addressId);
			map.put("orderId", orderId);
			int i = personOrderMapper.updAddress(map);
			if(i < 0){
				resu.setStatus(1);
				resu.setMsg("失败");
				return resu;
			}
			resu.setStatus(0);
			resu.setMsg("ok");
			return resu;
		}
		resu.setStatus(2);
		resu.setMsg("数据为空");
		return resu;
	}
}
