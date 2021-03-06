/**
 * 
 */
package com.jsk.zx.system.mapper;

import java.util.List;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.system.model.JskSys1User;
import com.jsk.zx.system.model.JskSysUser;

public interface UserCheckMapper extends IBaseMapper {

	List<JskSysUser> findUserByStatus();

	List<JskSys1User> findUserInfoById(Integer pkId);
}
