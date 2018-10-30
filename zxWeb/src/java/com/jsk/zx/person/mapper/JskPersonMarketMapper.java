package com.jsk.zx.person.mapper;

import java.util.List;

import com.jsk.zx.person.model.JskPersonMarket;
import com.mltt.core.mapper.IBaseEntityMapper;

public interface JskPersonMarketMapper extends IBaseEntityMapper<JskPersonMarket>{

	/**
	 * @Title: selectByPrimaryKey
	 * @Description: 根据主键查询
	 * @author: suojinliang
	 * @date: 2018年7月13日 
	 * @param pkId
	 * @return
	 */
    JskPersonMarket selectMarketByPrimaryKey(Integer pkId);
    
    /**
     * @Title: selectByInKey
     * @Description:多个id查询产品
     * @author: suojinliang
     * @date: 2018年7月10日 
     * @param ids
     * @return
     */
    List<JskPersonMarket> selectByInKey(String[] ids);
    
    /**
     * @Title: selectPersonMarket
     * @Description:查询积分商城商品
     * @author: liuyan
     * @date: 2018年7月24日 
     * @return
     */
    List<JskPersonMarket> selectPersonMarket();
}