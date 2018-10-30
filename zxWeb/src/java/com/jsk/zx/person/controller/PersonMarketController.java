package com.jsk.zx.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.service.IPersonMarketService;

/**
 * @Title: PersonMarketController.java
 * @Description: 积分商城商品查询
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/personMarket")
public class PersonMarketController extends BaseController {

	@Autowired
	private IPersonMarketService personMarketService;

	// 积分商城商品查询
	@RequestMapping("/selectPersonMarket")
	@ResponseBody
	public String selectPersonMarket() {
		ResultUtil re = new ResultUtil();
		try {
			re = personMarketService.selectPersonMarket();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
}