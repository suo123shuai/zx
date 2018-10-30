package com.jsk.zx.person.mapper;

import java.util.List;
import java.util.Map;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.person.model.JskPersonShop;

public interface JskPersonShopMapper extends IBaseMapper {
	
	/**
	 * @Title: deleteByShopId
	 * @Description: 删除购物车
	 * @author: suojinliang
	 * @date: 2018年6月25日
	 * @param pkId
	 * @return
	 */
    int deleteByShopId(String[] pkId);
    
    /**
     * @Title: deleteByUserId
     * @Description: 清空购物车
     * @author: suojinliang
     * @date: 2018年6月25日 
     * @param id
     * @return
     */
    int deleteByUserId(Integer userId);

    /**
     * 
     * @Description:查询购物车里的是否有该物品
     * @param record
     * @return
     * 2018年6月14日
     */
    JskPersonShop findByUserIdAndRecordId(JskPersonShop jskPersonShop);
    
    /**
     * 查询用户的购物车
     */
    List<JskPersonShop> findServiceByUserId(Map<String, Object> map);
    
  
    /**
     * @Title: findByInPkId
     * @Description: 多个id查询购物车
     * @author: suojinliang
     * @date: 2018年7月11日 
     * @param id
     * @return
     */
    List<JskPersonShop> findByInPkId(String[] ids);
    
    /**
     * 
     * @Description:添加购物车
     * @param record
     * @return
     * 2018年6月14日
     */
    int saveJskPersonSho(JskPersonShop record);
    
    /**
     * 购物车更新购买数量
     */
    int updateJskPersonSho(JskPersonShop record);
    
    
}