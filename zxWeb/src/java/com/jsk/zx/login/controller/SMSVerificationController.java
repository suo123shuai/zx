package com.jsk.zx.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.login.service.ISMSVerificationService;


@Controller
public class SMSVerificationController {
	
	@Autowired
	private ISMSVerificationService smsVerification;
	
	@RequestMapping("/smsverification")
	@ResponseBody
	public String smsYanZheng(String phone) throws Exception{
		ResultUtil resultUtil = smsVerification.smsYanZheng(phone);
		//return JSONObject.fromObject(resultUtil).toString();
		return JSON.toJSONString(resultUtil);
	}
}
