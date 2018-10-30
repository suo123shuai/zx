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
import com.jsk.zx.index.service.IFindWorkerService;
import com.jsk.zx.login.common.ResultUtil;

/**
 * @Title: FindWorkerController.java
 * @Description: 找工人
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/findWorker")
public class FindWorkerController extends BaseController {

	@Autowired
	private IFindWorkerService FindworkerService;
	
	@RequestMapping("/selectWorker")
	@ResponseBody
	public String selectWorker(int pkId, String findType) {
		ResultUtil re = new ResultUtil();
		try {
			re = FindworkerService.selectWorker(pkId, findType);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	
	//首页找工人搜索页
	@RequestMapping("/searchWorkerByNameAndWorkType")
	@ResponseBody
	public String searchWorker(String userName) {
		ResultUtil re = new ResultUtil();
		try {
			re = FindworkerService.searchWorker(userName);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	
	
	@RequestMapping("/findWorkerDetailById")
	@ResponseBody
	//找工人详情页(根据工人的id查询详情)
	public String findWorkerDetailById(int pkId) {
		ResultUtil re = new ResultUtil();
		try {
			re = FindworkerService.selectWorkerById(pkId);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	//加盟合作，查找商户
	@RequestMapping("/findShop")
	@ResponseBody
	public String findShop() {
		ResultUtil re = new ResultUtil();
		try {
			re = FindworkerService.findShop();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}

}
