/**
 * 
 */
package com.jsk.zx.system.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.jsk.zx.system.mapper.IJskSysUserMapper;
import com.jsk.zx.system.model.JskSysUser;
import com.jsk.zx.system.service.IJskSysUserService;
import com.mltt.core.service.BaseEntityService;

/**
 * @Title: JskSysUserImpl.java
 * @Description: 用户管理
 * @author: lizp
 * @date: 2018年7月24日 上午12:15:40
 */
@Service
public class JskSysUserServiceImpl extends BaseEntityService<JskSysUser, IJskSysUserMapper> implements IJskSysUserService {

	/**
	 * @Title: findPassWordByLoginName
	 * @Description: 根据登录名查询用户对象
	 * @author: lizp
	 * @date: 2018年7月23日
	 * @param loginName
	 * @return
	 */
	public JskSysUser findByLoginName(String loginName) {
		return mapper.findByLoginName(loginName);
	}

	@Override
	public JskSysUser findByLoginId(Integer pkId) {
		JskSysUser user = mapper.findByLoginId(pkId);
		return user;
	}

	@Override
	public int updstatus(Integer pkId, String reason, String status) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("pkId", pkId);
		map.put("reason", reason);
		map.put("status", status);
		int i = mapper.updstatus(map);
		return i;
	}
	
}
