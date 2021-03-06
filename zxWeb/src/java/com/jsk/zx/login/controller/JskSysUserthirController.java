package com.jsk.zx.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.login.model.JskSysUserthird;
import com.jsk.zx.login.model.ResuUtil;
import com.jsk.zx.login.service.IJskSysUserthirdService;

@Controller
@RequestMapping("/Userthird")
public class JskSysUserthirController extends BaseController{

	@Autowired
	private IJskSysUserthirdService jskSysUserthirdService;
	
	@RequestMapping("/saveJskSysUserthird")
	@ResponseBody
	public String saveJskSysUserthird(JskSysUserthird jskSysUserthird) throws Exception{
		ResuUtil resu = jskSysUserthirdService.saveJskSysUserthird(jskSysUserthird);
		return JSON.toJSONString(resu);
	}
	
	@RequestMapping("/updateJskSysUserthird")
	@ResponseBody
	public String updateJskSysUserthird(Integer userId,Integer pkId) throws Exception{
		ResultUtil resu = jskSysUserthirdService.updateUserPkId(userId, pkId);
		return JSON.toJSONString(resu);
	}
}
