/**
 * 
 */
package com.jsk.zx.system.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsk.base.common.Constant;
import com.jsk.base.common.UserSession;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.login.common.Md5Utils;
import com.jsk.zx.system.model.JskSysUser;
import com.jsk.zx.system.service.IJskSysUserService;

/**
 * @Title: LoginController.java
 * @Description: 登录
 * @author: lizp
 * @date: 2018年06月5日 下午10:17:18
 */
@Controller
@RequestMapping("/system")
public class LoginController extends BaseController {

	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private IJskSysUserService jskSysUserService;

	@RequestMapping("/login")
	public ModelAndView checkLogin(String loginName, String password) throws Exception {
		ModelAndView mav = new ModelAndView("/index");
		boolean login = false;
		UserSession userSession = (UserSession)request.getSession().getAttribute(Constant.USER_SESSION);
		// 不为空表示已登录
		if(userSession != null) {
			return mav;
		} else {
			userSession = new UserSession();
		}
		JskSysUser user = jskSysUserService.findByLoginName(loginName);
		if(user != null) {
			if(!user.getLoginPwd().equals(password)) {
				login = true;
				mav.addObject("errorMessage", "密码错误");
			}else{
				userSession.setUser(user);
				request.getSession().setAttribute(Constant.USER_SESSION, userSession);
			}
		} else{
			login = true;
			mav.addObject("errorMessage", "用户名错误或未审核成功");
		}
		if (login) {
			mav.setViewName("login");
		}
		return mav;
	}

	/**
	 * @Title: exit
	 * @Description: 退出系统
	 * @author: lizp
	 * @date: 2018年06月8日
	 * @return
	 */
	@RequestMapping("exit")
	public String exit() {
		request.getSession().removeAttribute(Constant.USER_SESSION);
		return "login";
	}

}
