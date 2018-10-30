package com.jsk.zx.index.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsk.base.controller.BaseController;
import com.jsk.zx.index.model.JskSysUser;
import com.jsk.zx.index.service.IOpsitionService;

/**
 * @Title: OpsitionController.java
 * @Description: 定位
 * @author: lihao
 * @date: 2018-6-11 上午12:25:27
 */

@Controller
@RequestMapping("/opsitionService")
public class OpsitionController extends BaseController {
	@Autowired
	private IOpsitionService opsitionService;

	@ResponseBody
	@RequestMapping("/updateByUserName")
	public void updateCity(JskSysUser jskSysUser) {
	
		opsitionService.updateByUserName(jskSysUser);
		
	}

}
