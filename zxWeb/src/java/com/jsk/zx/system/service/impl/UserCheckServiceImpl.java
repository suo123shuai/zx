package com.jsk.zx.system.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.service.BaseService;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.system.mapper.UserCheckMapper;
import com.jsk.zx.system.model.JskSysUser;
import com.jsk.zx.system.service.IUserCheckService;

@Service("userCheckServiceImpl")
public class UserCheckServiceImpl extends BaseService implements
		IUserCheckService {

	@Autowired
	private UserCheckMapper userCheckMapper;

	@Override
	public ResultUtil findUserByStatus() throws Exception {
		ResultUtil retu = new ResultUtil();

		List<JskSysUser> list = userCheckMapper
				.findUserByStatus();
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setMsg("没有待审核的用户");
		}
		return retu;
	}
}
