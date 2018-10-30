/**
 * 
 */

package com.jsk.zx.person.service;

import java.util.List;

import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.model.JskPersonOrder;
import com.jsk.zx.person.model.JskPersonOrderDetail;
import com.jsk.zx.person.model.ResuUtil;

public interface IPersonOrderService {

	ResultUtil findPersonOrderById(int userId,String status) throws Exception;

	ResultUtil findOrderById(Integer userId,String status) throws Exception;

	ResultUtil findPersonServiceOrderById(int userId) throws Exception;

	/**
	 * 确认订单
	 * @Title: detailOrder
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月17日 
	 * @param id 用户id
	 * @param type 物品类型
	 * @param ids 物品id(多个id)
	 * @return
	 */
	ResuUtil detailOrder(Integer id, String type, String ids);
	
	/**
	 * 生成订单
	 * @Title: saveOrder
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月18日 
	 * @param order 
	 * @param orderDetail
	 * @return
	 */
	ResuUtil saveOrder(JskPersonOrder order, List<JskPersonOrderDetail> orderDetail);
	
	/**
	 * 更新订单状态
	 * @Title: updateOrder
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月18日 
	 * @param orderId
	 * @param status
	 * @return
	 */
	ResuUtil updateOrder(Integer orderId, String status);
	/**
	 * 订单详情页面中的工种
	 * @Title: findWorkTypeByRecordId
	 * @Description: 
	 * @author:liuyan
	 * @date: 2018年7月26日 
	 * @param recordId
	 * @return
	 */
	ResultUtil findWorkTypeByRecordId(int recordId);
	
	/**
	 * 订单详情页面中的服务信息
	 * @Title: findServiceOrderDetailByRecordId
	 * @Description: 
	 * @author:liuyan
	 * @date: 2018年7月26日 
	 * @param recordId
	 * @return
	 */
	ResultUtil findServiceOrderDetailByRecordId(int recordId);
	
	/**
	 * 向订单中插入地址
	 * @Title: insertExpressIntoOrder
	 * @Description: 
	 * @author:liuyan
	 * @date: 2018年7月26日 
	 * @param pkId,express,expressType
	 * @return
	 */
	ResultUtil insertExpressIntoOrder(Integer pkId,String express,String expressType);
	
	/**
	 * 快速支付订单生成
	 * @Title: saveRapidOrder
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月30日 
	 * @param order
	 * @param orderDetail
	 * @return
	 */
	ResuUtil saveRapidOrder(String type, Integer recordId, Integer num, Integer userId);
	
	/**
	 * 向订单中插入收货地址
	 * @Title: updAddressId
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年8月6日 
	 * @param orderId
	 * @param addressId
	 * @return
	 */
	ResuUtil updAddressId(String orderId, Integer addressId);
}
