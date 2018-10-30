package com.jsk.zx.login.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.login.model.JskSysUser;
import com.jsk.zx.login.model.ResuUtil;
import com.jsk.zx.login.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{

	@Autowired
	private IUserService user;

	@RequestMapping("/findname")
	@ResponseBody
	public String findByName(String name) {
		ResultUtil resultUtil;
		try {
			resultUtil = user.findByName(name);
			return JSON.toJSONString(resultUtil);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	/**
	 * 
	 * @Title: saveOrUpdateUser
	 * @Description:
	 * @author: suojinliang
	 * @date: 2018年6月21日
	 * @param jskSysUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updateuser")
	@ResponseBody
	public String saveOrUpdateUser(JskSysUser jskSysUser) throws Exception {
		ResultUtil resultUtil = user.saveOrUpdateUser(jskSysUser);
		return JSON.toJSONString(resultUtil);
	}
	
	@RequestMapping("/update")
	public String updateCommentNum(@RequestParam Integer productId, @RequestParam String type){
		Map<String, Object> map = new HashMap<String, Object>();
		ResultUtil resu = user.updateCommentNum(map);
		return JSON.toJSONString(resu);
	}

	@RequestMapping("/login")
	@ResponseBody
	public String userLogin(String loginName, String loginPwd) throws Exception {
		ResultUtil resultUtil = user.userLogin(loginName, loginPwd);
		return JSON.toJSONString(resultUtil);
	}

	@RequestMapping("/mobileLogin")
	@ResponseBody
	public String mobileLogin(String phone) throws Exception { 
		ResuUtil resu = user.mobileLogin(phone);
		return JSON.toJSONString(resu);
	}
	
	@RequestMapping("/findUserInfo")
	@ResponseBody
	public String findUserInfoById(Integer pkId) {//根据用户Id查询用户信息
		ResultUtil re = new ResultUtil();
		try {
			re = user.findUserInfoById(pkId);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}

	@RequestMapping("/updateusera")
	@ResponseBody
	public String updateUser(JskSysUser jskSysUser){
		ResultUtil resu = null;
		try {
			resu = user.updateUserInfoById(jskSysUser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(resu);
	}
	
	@ResponseBody
	@RequestMapping("/updlogin")
	public String updateLogeNamePow(Integer pkId, String loginPwd){
		ResultUtil resu = new ResultUtil();
		if(!StringUtils.isEmpty(pkId) && !StringUtils.isEmpty(pkId) && !StringUtils.isEmpty(pkId)){
			int i = user.updateLogeNamePow(pkId, loginPwd);
			if(i > 0){
				resu.setId(0);
				resu.setMsg("ok");
				return JSON.toJSONString(resu);
			}
			resu.setId(1);
			resu.setMsg("失败");
			return JSON.toJSONString(resu);
		}
		resu.setId(2);
		resu.setMsg("数据为空");
		return JSON.toJSONString(resu);
	}
	
	@RequestMapping("/updcity")
	public @ResponseBody String updcity(Integer pkId, String city){
		ResultUtil resu = new ResultUtil();
		if(StringUtils.isEmpty(city) || StringUtils.isEmpty(pkId)){
			resu.setId(1);
			resu.setMsg("数据为空");
			return JSON.toJSONString(resu);
		}
		int i = user.updCity(pkId, city);
		if(i > 0){
			resu.setId(0);
			resu.setMsg("ok");
			return JSON.toJSONString(resu);
		}
		resu.setId(2);
		resu.setMsg("更新失败");
		return JSON.toJSONString(resu);
	}
	
	@RequestMapping("/finduser")
	public @ResponseBody String findUser(Integer pkId){
		com.jsk.zx.person.model.ResuUtil resu = new com.jsk.zx.person.model.ResuUtil();
		if(StringUtils.isEmpty(pkId)){
			resu.setStatus(1);
			resu.setMsg("数据为空");
			return JSON.toJSONString(resu);
		}
		JskSysUser jskUser = user.findUser(pkId);
		if(StringUtils.isEmpty(jskUser)){
			resu.setStatus(2);
			resu.setMsg("用户信息为空");
			return JSON.toJSONString(resu);
		}
		resu.setStatus(0); 
		resu.setMsg("ok");
		resu.setData(jskUser);
		return JSON.toJSONString(resu);
	}
}
