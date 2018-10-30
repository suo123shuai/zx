/**
 * 
 */
package com.jsk.zx.system.mapper;

import java.util.Map;

import com.jsk.zx.system.model.JskSysUser;
import com.mltt.core.mapper.IBaseEntityMapper;

/**
 * @Title: IJskSysUser.java
 * @Description: 用户管理
 * @author: lizp
 * @date: 2018年7月23日 下午11:34:54
 */
public interface IJskSysUserMapper extends IBaseEntityMapper<JskSysUser> {

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
	 * @Title: findByLoginName
	 * @Description: 根据用户id查询用户对象
	 * @author: suojinliang
	 * @date: 2018年8月12日 
	 * @param pkId
	 * @return
	 */
	public JskSysUser findByLoginId(Integer pkId);
	
	/**
	 * @Title: updstatus
	 * @Description: 更新审核状态
	 * @author: suojinliang
	 * @date: 2018年8月16日 
	 * @param map
	 * @return
	 */
	int updstatus(Map<String, Object> map);
}
