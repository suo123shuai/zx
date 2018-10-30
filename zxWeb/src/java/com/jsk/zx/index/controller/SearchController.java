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
import com.jsk.zx.index.service.ISearchService;
import com.jsk.zx.login.common.ResultUtil;


/**
 * @Title: SearchController.java
 * @Description: 搜索
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/search")
public class SearchController extends BaseController {
	
	@Autowired
	private ISearchService searchService;

	@RequestMapping("/findByTitle")
	@ResponseBody
	public String findByTltle(String title){
		ResultUtil re=new ResultUtil();
		try {
			re = searchService.findByTitle(title);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	

}
