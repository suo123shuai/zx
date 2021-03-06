package com.jsk.zx.pay.service;

import com.jsk.zx.login.model.JskSysUser;
import com.jsk.zx.person.model.JskPersonOrder;

public interface IPayUpdateOrderAndUser {

	/**
	 * 更新支付状态
	 * @Title: updateOrderById
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月24日 
	 * @param order
	 * @param status
	 * @return
	 */
	Integer updateOrderById(String order, String status);
	
	/**
	 * 查找订单
	 * @Title: findPersonOrderByOrderId
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月24日 
	 * @param orderId
	 * @return
	 */
	public JskPersonOrder findPersonOrderByOrderId(String orderId);
	
	/**
	 * 更新用户积分
	 * @Title: updateUserMarket
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月24日 
	 * @param userId
	 * @param integral
	 * @return
	 */
	public int updateUserMarket(Integer userId, Integer integral,Integer integralTotal);
	
	/**
	 * 查询用户信息
	 * @Title: findUserInfoById
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月28日 
	 * @param pkId
	 * @return
	 */
	public JskSysUser findUserInfoById(Integer pkId);
}
