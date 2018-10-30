package com.jsk.zx.person.mapper;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.person.model.JskIndexService;

public interface JskIndexServiceMapper extends IBaseMapper{

	/**
	 * @Title: selectByPrimaryKey
	 * @Description: 查询服务
	 * @author: suojinliang
	 * @date: 2018年7月13日 
	 * @param pkId
	 * @return
	 */
    JskIndexService selectByPrimaryKey(Integer pkId);

}