package com.jsk.zx.pay.mapper;

import com.jsk.zx.pay.model.JskIndexUserNews;

public interface JskUserNewsMapper {

	/**
	 * 插入用户消息表
	 * @Title: insertSelective
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月29日 
	 * @param record
	 * @return
	 */
    int insertSelective(JskIndexUserNews record);

}