/**
 * 
 */
package com.jsk.zx.index.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.index.service.IFindServeService;
import com.jsk.zx.login.common.ResultUtil;

import net.sf.json.JSONObject;

/**
 * @Title: FindServiceController.java
 * @Description: 找服务
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/findServe")
public class FindServeController extends BaseController {

	@Autowired
	private IFindServeService FindServeService;

	// 找服务
	@RequestMapping("/selectService")
	@ResponseBody
	public String selectService(String type,String serviceSign) {
		ResultUtil re = new ResultUtil();
		try {
			re = FindServeService.selectService(type,serviceSign);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}

	// 我的动态企业用户的招聘信息
	@RequestMapping("/findMyService")
	@ResponseBody
	public String findMyService(Integer userId) {
		ResultUtil re = new ResultUtil();
		try {
			re = FindServeService.findMyService(userId);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	
	// 找服务详情页
	@RequestMapping("/findServiceDetail")
	@ResponseBody
	public String findServiceDetail(int pkId) {
		ResultUtil re = new ResultUtil();
		try {
			re = FindServeService.findServiceDetail(pkId);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	
	// 找服务搜索功能
		@RequestMapping("/searchServiceByTitle")
		@ResponseBody
		public String searchServiceByTitle(String title) {
			ResultUtil re = new ResultUtil();
			try {
				re = FindServeService.searchServiceByTitle(title);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return JSON.toJSONString(re);
		}

}
