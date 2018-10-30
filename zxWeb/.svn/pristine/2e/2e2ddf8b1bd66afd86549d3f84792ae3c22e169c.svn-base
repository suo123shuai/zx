package com.jsk.zx.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.model.JskPersonPraise;
import com.jsk.zx.person.service.IPersonPraiseService;

@Controller
@RequestMapping("/personPraise")
public class PersonPraiseController extends BaseController{

	@Autowired
	private IPersonPraiseService  personPraiseService;
	
	
	@RequestMapping("/insertPersonPraise")
	@ResponseBody
	/**
	 * insertPersonPraise方法，实现点赞功能
	 * @param jskPersonPraise
	 * @return
	 */
	public String insertPersonPraise(JskPersonPraise jskPersonPraise) {
		
		ResultUtil resultUtil = personPraiseService.insertPraise(jskPersonPraise);
		
		return JSON.toJSONString(resultUtil);
	}
}
