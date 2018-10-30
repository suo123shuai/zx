/**
 * 
 */
package com.jsk.zx.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsk.zx.system.model.JskSysUser;
import com.jsk.zx.system.service.IJskSysUserService;
import com.mltt.core.controller.BaseEntityController;

/**
 * @Title: JskSysUserController.java
 * @Description: 用户管理 
 * @author: lizp
 * @date: 2018年7月31日 上午2:04:56
 */
@Controller
@RequestMapping("/secure/user")
public class JskSysUserController extends BaseEntityController<JskSysUser, IJskSysUserService> {

	@ResponseBody
	@RequestMapping("/review")
	public ModelAndView review(Integer pkId){
		ModelAndView mav = new ModelAndView("/jsk/zx/system/user/user_review");
		JskSysUser user = service.findByLoginId(pkId);
		mav.addObject("jskSysUser", user);
		return mav;
	}
	
	@RequestMapping("/reviweupd")
	public ModelAndView reviweupd(@RequestParam Integer pkId, @RequestParam String reason,@RequestParam String status){
		service.updstatus(pkId, reason, status);
		return new ModelAndView("redirect:/secure/user/findPage");
	}
}
