package com.jsk.zx.index.controller;


import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.index.service.IDaShiQuanService;
import com.jsk.zx.login.common.ResultUtil;


/**
 * @Title: DaShiQuanController.java
 * @Description: 搜索
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/daShiQuan")
public class DaShiQuanController extends BaseController {
	
	@Autowired
	private IDaShiQuanService daShiQuanService;
    //大时圈头条
	@RequestMapping("/findTopNews")
	@ResponseBody
	public String findDaShiQuan(){
		ResultUtil re=new ResultUtil();
		try {
			re = daShiQuanService.findDaShiQuan();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	//头条详情页
	@RequestMapping("/findTopNewsDetailById")
	@ResponseBody
	public String findTopNewsDetail( int pkId){
		ResultUtil re=new ResultUtil();
		try {
			re = daShiQuanService.findTopNewsDetail(pkId);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	

}
