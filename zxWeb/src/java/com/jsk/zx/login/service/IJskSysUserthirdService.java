package com.jsk.zx.login.service;

import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.login.model.JskSysUserthird;
import com.jsk.zx.login.model.ResuUtil;

/**
 * 
 * @Title: IJskSysUserthirdService.java
 * @Description: TODO 
 * @author: suojinliang
 * @date: 2018年6月21日 下午2:17:01
 */
public interface IJskSysUserthirdService {

	/**
	 * 
	 * @Title: saveJskSysUserthird
	 * @Description: 插入第三方登录信息
	 * @author: suojinliang
	 * @date: 2018年6月21日 
	 * @param jskSysUserthird
	 * @return
	 * @throws Exception
	 */
	ResuUtil saveJskSysUserthird(JskSysUserthird jskSysUserthird)throws Exception;
	
	/**
	 * 
	 * @Title: updateUserPkId
	 * @Description: 加入用户ID关联用户信息
	 * @author: suojinliang
	 * @date: 2018年6月21日 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	ResultUtil updateUserPkId(Integer userId,Integer pkId)throws Exception;
}

