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
import com.jsk.zx.index.service.IGoldServeService;
import com.jsk.zx.login.common.ResultUtil;

import net.sf.json.JSONObject;

/**
 * @Title: FindWorkerController.java
 * @Description: 金牌服务
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/goldServe")
public class GoldServeController extends BaseController {
	
	@Autowired
	private IGoldServeService goldServeService;

	@RequestMapping("/findGoldServe")
	@ResponseBody
	public String findGoldServe(){
		ResultUtil re=new ResultUtil();
		try {
			re = goldServeService.findGoldServe();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	
	// 金牌服务详情
		@RequestMapping("/selectGoldServeDetilById")
		@ResponseBody
		public String selectGoldServeDetilById(int pkId) {
			ResultUtil re = new ResultUtil();
			try {
				re = goldServeService.selectGoldServeDetilById(pkId);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return JSON.toJSONString(re);
		}
	

}
