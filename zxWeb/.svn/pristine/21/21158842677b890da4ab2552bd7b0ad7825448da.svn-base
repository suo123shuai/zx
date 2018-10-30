/**
 * 
 */
package com.jsk.zx.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsk.base.controller.BaseController;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.system.service.IUserCheckService;
import net.sf.json.JSONObject;

/**
 * @Title: userCheckController.java
 * @Description: 用户审核
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/userCheck")

public class UserCheckController  extends BaseController {
	

	@Autowired
	private IUserCheckService userCheckService;
	
	@RequestMapping("/selectUser")
	@ResponseBody
	public String findUserByStatus() {
		ResultUtil re = new ResultUtil();
		try {
			re = userCheckService.findUserByStatus();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSONObject.fromObject(re).toString();
	}

}
