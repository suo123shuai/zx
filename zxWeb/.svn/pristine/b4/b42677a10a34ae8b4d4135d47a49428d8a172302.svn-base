/**
 * 
 */
package com.jsk.base.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.jsk.base.common.Constant;

/**
 * @Title: CheckLoginInterceptor.java
 * @Description: 检测用户是否登录
 * @author: lizp
 * @date: 2018年7月25日 下午11:37:46
 */
public class CheckLoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (request.getSession().getAttribute(Constant.USER_SESSION) == null) {
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}
}
