/**
 * 
 */
package com.jsk.zx.index.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.index.service.IRecommendService;
import com.jsk.zx.login.common.ResultUtil;

import net.sf.json.JSONObject;

/**
 * @Title: RecommendController.java
 * @Description: 商品推荐
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/recommend")
public class RecommendController extends BaseController {
	
	@Autowired
	private IRecommendService recommendService;

	@RequestMapping("/selectRecommend")
	@ResponseBody
	public String selectRecommend(){
		ResultUtil re=new ResultUtil();
		try {
			re = recommendService.selectRecommend();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return JSON.toJSONString(re);
	}
	

}
