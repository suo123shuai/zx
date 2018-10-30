package com.jsk.zx.system.service;

import com.jsk.zx.system.model.JskSysUser;
import com.mltt.core.service.IEntityService;

/**
 * @Title: IJskSysUserService.java
 * @Description: 用户管理
 * @author: lizp
 * @date: 2018年7月23日 下午11:34:01
 */
public interface IJskSysUserService extends IEntityService<JskSysUser>{

	/**
	 * @Title: findByLoginName
	 * @Description: 根据登录名查询用户对象
	 * @author: lizp
	 * @date: 2018年7月23日
	 * @param loginName
	 * @return
	 */
	public JskSysUser findByLoginName(String loginName);

	/**
	 * @Title: findByLoginId
	 * @Description: 根据用户id查询用户对象
	 * @author: suojinliang
	 * @date: 2018年8月12日 
	 * @param piId
	 * @return
	 */
	public JskSysUser findByLoginId(Integer pkId);
	
	/**
	 * @Title: updstatus
	 * @Description: 更新用户状态
	 * @author: suojinliang
	 * @date: 2018年8月16日 
	 * @param pkId
	 * @param reason
	 * @param status
	 * @return
	 */
	public int updstatus(Integer pkId, String reason, String status);
}
