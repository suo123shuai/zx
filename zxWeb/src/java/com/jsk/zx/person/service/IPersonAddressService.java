package com.jsk.zx.person.service;

import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.model.JskPersonAddress;

public interface  IPersonAddressService {
	
	ResultUtil findPersonAddressById(int userId) throws Exception;
	
	ResultUtil createOrUpdatePersonAddress(JskPersonAddress jskPersonAddress) throws Exception;
	
	ResultUtil deletePersonAddressById(int pkId) throws Exception;
	
	/**
	 * 查询用户所有地址
	 * @Title: selectByUserKey
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年8月3日 
	 * @param userId
	 * @return
	 */
	ResultUtil selectByUserKey(Integer userId);

}
