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
import com.jsk.zx.index.service.ITrollService;
import com.jsk.zx.login.common.ResultUtil;


/**
 * @Title: SearchController.java
 * @Description: 轮播
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/troll")
public class TrollController extends BaseController {
	
	@Autowired
	private ITrollService trollService;

	@RequestMapping("/selectAll")
	@ResponseBody
	public String selectAll(){
		ResultUtil re=new ResultUtil();
		try {
			re = trollService.selectAll();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	

}
