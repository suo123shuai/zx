package com.jsk.zx.login.service;

import java.util.Map;

import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.login.model.JskSysUser;
import com.jsk.zx.login.model.ResuUtil;


public interface IUserService {

	/**
	 * 
	 * @Title: findByName
	 * @Description: 判断用户名是否注册
	 * @author: suojinliang
	 * @date: 2018年6月21日 
	 * @param jskSysUser
	 * @return
	 * @throws Exception
	 */
	ResultUtil findByName(String name) throws Exception;
	
	/**
	 * 
	 * @Title: saveOrUpdateUser
	 * @Description: 根据jskSysUser是否有pkid来判断增加或更改
	 * @author: suojinliang
	 * @date: 2018年6月21日 
	 * @param jskSysUser
	 * @return 如果是增加用户返回用户主键ID
	 * @throws Exception
	 */
	ResultUtil saveOrUpdateUser(JskSysUser jskSysUser) throws Exception;
	
	/**
	 * 更新评论总数
	 * @Title: updateCommentNum
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月21日 
	 * @param map
	 * @return
	 */
	ResultUtil updateCommentNum(Map<String, Object> map);
	
	/**
	 * @Title: userLogin
	 * @Description: 根据用户名密码登录
	 * @author: suojinliang
	 * @date: 2018年7月3日 
	 * @param loginName
	 * @param loginPwd
	 * @return
	 * @throws Exception
	 */
	ResultUtil userLogin(String loginName, String loginPwd) throws Exception;
	
	/**
	 * @Title: mobileLogin
	 * @Description:根据电话登录
	 * @author: suojinliang
	 * @date: 2018年7月3日 
	 * @param mobile
	 * @return
	 * @throws Exception
	 */
	ResuUtil mobileLogin(String mobile)throws Exception;
	/**
	 * @Title: findUserInfoById
	 * @Description:根据用户id查询用户信息
	 * @author: liuyan
	 * @date: 2018年7月25日 
	 * @param pkId
	 * @return
	 * @throws Exception
	 */
	ResultUtil findUserInfoById(Integer pkId) throws Exception;
	
	/**
	 * 更新用户信息
	 * @Title: updateUserInfoById
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月25日 
	 * @param pkId
	 * @return
	 * @throws Exception
	 */
	ResultUtil updateUserInfoById(JskSysUser jskSysUser) throws Exception;
	
	/**
	 * 设置后台账号密码
	 * @Title: updateLogeNamePow
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年8月10日 
	 * @param pkId
	 * @param loginName
	 * @param loginPow
	 * @return
	 */
	int updateLogeNamePow(Integer pkId, String loginPow);
	
	/**
	 * @Title: updCity
	 * @Description: 更新用户定位地址
	 * @author: suojinliang
	 * @date: 2018年8月15日 
	 * @param pkId
	 * @param city
	 * @return
	 */
	int updCity(Integer pkId, String city);
	
	/**
	 * @Title: findUser
	 * @Description: 用户id查用户
	 * @author: suojinliang
	 * @date: 2018年8月16日 
	 * @param pkId
	 * @return
	 */
	JskSysUser findUser(Integer pkId);
}
