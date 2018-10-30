package com.jsk.zx.index.service;

import com.jsk.zx.index.model.JskIndexNews;
import com.jsk.zx.login.common.ResultUtil;

public interface IJskIndexNewsService {

	ResultUtil findByType() throws Exception;
	
	/**
	 * 查询个人消息
	 * @Title: findByUsertype
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月30日 
	 * @param type
	 * @param userId
	 * @return
	 */
	ResultUtil findByUsertype(Integer userId);
	
	/**
	 * 插入新的消息
	 * @Title: saveNews
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月30日 
	 * @param jskIndexNews
	 * @return
	 */
	ResultUtil saveNews(JskIndexNews jskIndexNews);
}
