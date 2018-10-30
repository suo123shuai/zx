/**
 * 
 */
package com.jsk.zx.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.model.Order;
import com.jsk.zx.person.model.ResuUtil;
import com.jsk.zx.person.service.IPersonOrderService;

/**
 * @Title: PersonOrderController.java
 * @Description: 我的订单查询
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/personOrder")
public class PersonOrderController extends BaseController {

	@Autowired
	private IPersonOrderService PersonOrderService;

	// 个人我的订单查询
	@RequestMapping("/findPersonOrderById")
	@ResponseBody
	public String findPersonOrderById(int userId, String status) {
		ResultUtil re = new ResultUtil();
		try {
			re = PersonOrderService.findPersonOrderById(userId, status);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}

	// 个人我的动态，即个人的的服务
	@RequestMapping("/findPersonServiceOrderById")
	@ResponseBody
	public String findPersonServiceOrderById(int userId) {
		ResultUtil re = new ResultUtil();
		try {
			re = PersonOrderService.findPersonServiceOrderById(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}

	// 企业以及商户我的订单查询
	@RequestMapping("/findOrderById")
	@ResponseBody
	public String findOrderById(Integer userId, String status) {
		ResultUtil re = new ResultUtil();
		try {
			re = PersonOrderService.findOrderById(userId, status);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}

	// 添加订单
	@RequestMapping("/affirmorder")
	@ResponseBody
	public String addOrder(Integer id, String type, String ids) {
		ResuUtil resu = new ResuUtil();
		try {
			resu = PersonOrderService.detailOrder(id, type, ids);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return JSON.toJSONString(resu);
	}

	@ResponseBody
	@RequestMapping("/addorder")
	public String saveOrder(Object order1){
		Order order = (Order)order1;
		ResuUtil resu = PersonOrderService.saveOrder(order, order.getOrderDetailList());
		return JSON.toJSONString(resu);
	}
	
	// 订单详情中的工种
	@RequestMapping("/findWorkTypeByRecordId")
	@ResponseBody
	public String findWorkTypeByRecordId(int recordId) {
		ResultUtil re = new ResultUtil();
		try {
			re = PersonOrderService.findWorkTypeByRecordId(recordId);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}

	// 服务订单详情页中的服务信息
	@RequestMapping("/findServiceOrderDetailByRecordId")
	@ResponseBody
	public String findServiceOrderDetailByRecordId(int recordId) {
		ResultUtil re = new ResultUtil();
		try {
			re = PersonOrderService.findServiceOrderDetailByRecordId(recordId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}

	// 向订单表中插入物流信息
	@RequestMapping("/insertExpressIntoOrder")
	@ResponseBody
	public String insertExpressIntoOrder(Integer pkId, String express,
			String expressType) {
		ResultUtil re = new ResultUtil();
		try {
			re = PersonOrderService.insertExpressIntoOrder(pkId, express,
					expressType);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}

	@ResponseBody
	@RequestMapping("/saveorder")
	public String saveorder(String type, Integer recordId, Integer num,
			Integer userId) {
		ResuUtil resu = PersonOrderService.saveRapidOrder(type, recordId, num,
				userId);
		return JSON.toJSONString(resu);
	}

	@RequestMapping("/updaddress")
	@ResponseBody
	public String updAddress(String orderId, Integer addressId) {
		ResuUtil resu = PersonOrderService.updAddressId(orderId, addressId);
		return JSON.toJSONString(resu);
	}
}