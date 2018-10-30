/**
 * 
 */

package com.jsk.zx.person.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.person.model.JskPersonOrder;

public interface JskPersonOrderMapper extends IBaseMapper {
	
	/**
	 * @Title: findProductOrderByRecordId
	 * @Description: 查询商品订单
	 * @author: liuyan
	 * @date: 2018年7月16日 
	 */
	public List<JskPersonOrder> findProductOrderByRecordId(@Param(value="recordId") int recordId,@Param(value="type") String type,@Param(value="status") String status);
	
	/**
	 * @Title: findServiceOrderByRecordId
	 * @Description: 查询服务员订单
	 * @author: liuyan
	 * @date: 2018年7月16日 
	 */
	public List<JskPersonOrder> findServiceOrderByRecordId(@Param(value="recordId") int recordId,@Param(value="type") String type,@Param(value="status") String status);
	
	public List<?>  selectProductRecordId(Integer userId);
	
	public List<?>  selectServiceRecordId(Integer userId);
	
	//public List<?>  selectMarketRecordId(int userId);
	
	//根据用户ID查询服务订单[个人我的动态]
	public List<JskPersonOrder> findServiceOrderById(int userId);
	

	/**
	 * @Title: saveOrder
	 * @Description: 插入订单
	 * @author: suojinliang
	 * @date: 2018年7月11日 
	 * @param order
	 * @return
	 */
	public int saveOrder(JskPersonOrder order);
	
	/**
	 * @Title: findPersonOrderById
	 * @Description: 查询个人订单
	 * @author: liuyan
	 * @date: 2018年7月16日 
	 * @param userId
	 * @return
	 */
	public List<JskPersonOrder> findPersonOrderById(@Param(value="userId")int userId,@Param(value="status")String status);
	
	/**
	 * 查找订单
	 * @Title: findPersonOrderByOrderId
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月19日 
	 * @param orderId
	 * @return
	 */
	public JskPersonOrder findPersonOrderByOrderId(String orderId);
	
	/**
	 * 更新支付状态
	 * @Title: updateOrderById
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月24日 
	 * @param order
	 * @return
	 */
	public Integer updateOrderById(Map<String, String> map);
	
	/**
	 * 更新订单状态
	 * @Title: updateOrder
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月18日 
	 * @param map
	 * @return
	 */
	public int updateOrder(Map<String, Object> map);
	/**
	 * 向订单中插入物流信息
	 * @Title: updateOrder
	 * @Description: 
	 * @author: liuyan
	 * @date: 2018年7月27日 
	 * @param pkId
	 * @param express
	 * @param expressType
	 * @return
	 */
	public int updateOrderExpressById(@Param(value="pkId")Integer pkId,@Param(value="express")String express,@Param(value="expressType")String expressType);

	/**
	 * 更新订单的收货地址
	 * @Title: updAddress
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年8月6日 
	 * @param map
	 * @return
	 */
	public int updAddress(Map<String, Object> map);
}