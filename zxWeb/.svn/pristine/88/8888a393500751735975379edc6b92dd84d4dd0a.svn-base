package com.jsk.zx.person.service;

import com.jsk.zx.person.model.JskPersonShop;
import com.jsk.zx.person.model.ResuUtil;


public interface IJskPersonShopService {

	
	/**
	 * 
	 * @Title: saveJskPersonShop
	 * @Description: 添加购物车
	 * @author: suojinliang
	 * @date: 2018年6月25日 
	 * @param jskPersonShop
	 * @return
	 * @throws Exception
	 */
	ResuUtil saveJskPersonShop(JskPersonShop jskPersonShop)throws Exception;
	
	/**
	 * @Title: updateShop
	 * @Description: 更新购物车
	 * @author: suojinliang
	 * @date: 2018年7月13日 
	 * @param jskPersonShop
	 * @return
	 */
	ResuUtil updateShop(JskPersonShop jskPersonShop);
	
	/**
	 * 
	 * @Title: findByUserId
	 * @Description: 查询购物车
	 * @author: suojinliang
	 * @date: 2018年6月25日 
	 * @param id用户ID
	 * @return
	 * @throws Exception
	 */
	ResuUtil findByUserId(Integer id, String type)throws Exception;
	
	/**
	 * @Title: deleteByShopId
	 * @Description: 删除购物车
	 * @author: suojinliang
	 * @date: 2018年6月25日 
	 * @param 购物车主键ID
	 * @return
	 * @throws Exception
	 */
	ResuUtil deleteByShopId(String shopIds)throws Exception;
	
	/**
	 * @Title: deleteByUserId
	 * @Description: 清空购物车
	 * @author: suojinliang
	 * @date: 2018年6月25日 
	 * @param id 用户ID
	 * @return
	 * @throws Exception
	 */
	ResuUtil deleteByUserId(Integer id)throws Exception;
}
