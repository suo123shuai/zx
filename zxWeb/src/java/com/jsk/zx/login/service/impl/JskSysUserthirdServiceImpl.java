package com.jsk.zx.login.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jsk.base.service.BaseService;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.login.mapper.JskSysUserMapper;
import com.jsk.zx.login.mapper.JskSysUserthirdMapper;
import com.jsk.zx.login.model.JskSysUser;
import com.jsk.zx.login.model.JskSysUserthird;
import com.jsk.zx.login.model.JskSysUserthirdExample;
import com.jsk.zx.login.model.JskSysUserthirdExample.Criteria;
import com.jsk.zx.login.model.ResuUtil;
import com.jsk.zx.login.service.IJskSysUserthirdService;

/**
 * 
 * @Title: JskSysUserthirdServiceImpl.java
 * @Description:第三方登录表
 * @author: suojinliang
 * @date: 2018年6月21日 下午2:17:16
 */
@Service
public class JskSysUserthirdServiceImpl extends BaseService implements
		IJskSysUserthirdService {

	@Autowired
	private JskSysUserthirdMapper jskSysUserthirdMapper;
	@Autowired
	private JskSysUserMapper userMapper;

	@Override
	public ResuUtil saveJskSysUserthird(JskSysUserthird jskSysUserthird) {
		ResuUtil resu = new ResuUtil();
		if (jskSysUserthird.getUnionid() != null
				&& !jskSysUserthird.getUnionid().isEmpty()) {
			JskSysUserthirdExample jskSysUserthirdExample = new JskSysUserthirdExample();
			Criteria criteria = jskSysUserthirdExample.createCriteria();
			criteria.andUnionidEqualTo(jskSysUserthird.getUnionid());
			List<JskSysUserthird> list = jskSysUserthirdMapper
					.selectByExample(jskSysUserthirdExample);
			// 判断用户是否用第三方登录过，如果未登录过插入信息
			if (list != null && !list.isEmpty()) {
				JskSysUser user = userMapper.findUserById(list.get(0)
						.getUserId());
				if ((null != user.getPkId() && !"".equals(user.getPkId()))
						&& (user.getPkId().equals(user.getCreateId()))){
					resu.setStatus(0);
					resu.setMsg("已登录");
					resu.setUserId(list.get(0).getUserId());
					return resu;
				}
				resu.setStatus(1);
				resu.setMsg("已登录过未注册");
				resu.setUserId(user.getPkId());
				return resu;
			}
			JskSysUser user = new JskSysUser();
			user.setCheckTime(new Date());
			user.setCreateTime(new Date());
			userMapper.saveSelective(user);
			jskSysUserthird.setCreateTime(new Date());
			jskSysUserthird.setUserId(user.getPkId());
			int i = jskSysUserthirdMapper.insertSelective(jskSysUserthird);
			if (i == 1) {
				resu.setStatus(1);
				resu.setMsg("首次登陆未注册");
				resu.setUserId(user.getPkId());
				return resu;
			}
		}
		resu.setStatus(2);
		resu.setMsg("登录失败");
		return resu;
	}

	@Override
	public ResultUtil updateUserPkId(Integer userId, Integer pkId)
			throws Exception {
		ResultUtil resu = new ResultUtil();
		JskSysUserthird jskSysUserthird = new JskSysUserthird();
		System.out.println(userId);
		System.out.println(pkId);

		if (userId == null || "".equals(userId)) {
			resu.setId(2);
			resu.setMsg("userId不能为空");
			return resu;
		}
		if (pkId == null || "".equals(pkId)) {
			resu.setId(2);
			resu.setMsg("pkId不能为空");
			return resu;
		}
		jskSysUserthird.setUpdateTime(new Date());
		jskSysUserthird.setUserId(userId);
		jskSysUserthird.setPkId(pkId);
		int i = jskSysUserthirdMapper
				.updateByPrimaryKeySelective(jskSysUserthird);

		if (i != 1) {
			resu.setId(1);
			resu.setMsg("插入失败");
			return resu;
		}
		resu.setId(0);
		resu.setMsg("ok");
		return resu;

	}

}
