/**
 * 
 */
package com.jsk.zx.index.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.index.model.JskIndexProduct;
import com.jsk.zx.index.model.JskIndexRecommend;
import com.jsk.zx.index.model.JskIndexService;
import com.jsk.zx.index.model.JskIndexTopNews;
import com.jsk.zx.index.model.JskIndexTroll;
import com.jsk.zx.index.model.JskIndexWork;
import com.jsk.zx.index.model.JskServiceWork;
import com.jsk.zx.index.service.IJskInsertService;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.model.JskPersonMarket;

import net.sf.json.JSONObject;

/**
 * @Title: JskInsertController.java
 * @Description: 插入产品，服务，积分商城,商品推荐，轮播
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/insert")
public class JskInsertController extends BaseController {

	@Autowired
	private IJskInsertService jskInsertService;

	@RequestMapping("/insertService")
	@ResponseBody
	// 插入服务，工作
	public String insertService(JskIndexService jskIndexService,
			HttpServletRequest request) {
		ResultUtil re = new ResultUtil();
		try {
			re = jskInsertService.insertService(jskIndexService, request);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	
	@RequestMapping("/insertWorkType")
	@ResponseBody
	// 插入工种
	public String insertWorkType(JskIndexWork jskIndexWork,
			HttpServletRequest request) {
		ResultUtil re = new ResultUtil();
		try {
			re = jskInsertService.insertWorkType(jskIndexWork, request);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	
	
	@RequestMapping("/insertServiceWork")
	@ResponseBody
	// 插入服务工种
	public String insertServiceWork(JskServiceWork jskServiceWork,
			HttpServletRequest request) {
		ResultUtil re = new ResultUtil();
		try {
			re = jskInsertService.insertServiceWork(jskServiceWork, request);

		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println(re);
		return JSON.toJSONString(re);
	}

	@RequestMapping("/insertProduct")
	@ResponseBody
	// 插入产品
	public String insertProduct(JskIndexProduct jskIndexProduct,
			HttpServletRequest request) {
		ResultUtil re = new ResultUtil();
		try {
			re = jskInsertService.insertProduct(jskIndexProduct, request);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return JSONObject.fromObject(re).toString();
	}

	@RequestMapping("/insertMarket")
	@ResponseBody
	// 插入积分商城产品
	public String insertMarket(JskPersonMarket jskPersonMarket,
			HttpServletRequest request) {
		ResultUtil re = new ResultUtil();
		try {
			re = jskInsertService.insertMarket(jskPersonMarket, request);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return JSONObject.fromObject(re).toString();
	}

	@RequestMapping("/insertRecommendProduct")
	@ResponseBody
	// 插入商品推荐模块中的商品
	public String insertRecommendProduct(JskIndexRecommend jskIndexRecommend,
			HttpServletRequest request) {
		ResultUtil re = new ResultUtil();
		try {
			re = jskInsertService.insertRecommendProduct(jskIndexRecommend,
					request);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return JSONObject.fromObject(re).toString();
	}

	@RequestMapping("/insertTroll")
	@ResponseBody
	// 插入轮播的商品
	public String insertTroll(JskIndexTroll jskIndexTroll,
			HttpServletRequest request) {
		ResultUtil re = new ResultUtil();
		try {
			re = jskInsertService.insertTroll(jskIndexTroll, request);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return JSONObject.fromObject(re).toString();
	}
	
	@RequestMapping("/insertTopNews")
	@ResponseBody
	// 插入服务，工作
	public String insertTopNews(JskIndexTopNews jskIndexTopNews,
			HttpServletRequest request) {
		ResultUtil re = new ResultUtil();
		try {
			re = jskInsertService.insertTopNews(jskIndexTopNews, request);

		} catch (Exception e) {

			e.printStackTrace();
		}
		return JSONObject.fromObject(re).toString();
	}

}