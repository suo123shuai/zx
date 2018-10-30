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
import com.jsk.zx.index.service.IFindWorkService;
import com.jsk.zx.login.common.ResultUtil;

/**
 * @Title: FindWorkController.java
 * @Description: 找工作
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/findWork")
public class FindWorkController extends BaseController {
	
	@Autowired
	private IFindWorkService findWorkService;

	@RequestMapping("/selectWork")
	@ResponseBody
	public String selectWork(){
		ResultUtil re=new ResultUtil();
		try {
			re = findWorkService.selectWork();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	//按照搜索条件查询符合要求的工作
	@RequestMapping("/findWorkByRequire")
	@ResponseBody
	public String findWorkByRequire(String address,String title){
		ResultUtil re=new ResultUtil();
		try {
			re = findWorkService.findWorkByRequire(address,title);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	
	
	//找工作详情页
	@RequestMapping("/findWorkDetilById")
	@ResponseBody
	public String findWorkDetilById(int pkId){
		ResultUtil re=new ResultUtil();
		try {
			re = findWorkService.selectWorkById(pkId);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	

}
