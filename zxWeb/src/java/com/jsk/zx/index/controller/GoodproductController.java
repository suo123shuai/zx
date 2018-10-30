package com.jsk.zx.index.controller;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsk.base.controller.BaseController;
import com.jsk.zx.index.model.JskIndexGoodproduct;
import com.jsk.zx.index.service.IGoodproductService;
import com.jsk.zx.login.common.ResultUtil;

/**
 * @Title: GoodproductController.java
 * @Description: 优质项目展示
 * @author: lihao
 * @date: 2018-6-13 上午12:25:27
 */

@Controller
@RequestMapping("/goodproductService")
public class GoodproductController extends BaseController{
	@Autowired
	private IGoodproductService goodproductService;

	/*根据项目状态将已发布的优质项目查询出来*/
	@ResponseBody
	@RequestMapping("/selectByStatus")
	public String selectByStatus(JskIndexGoodproduct goodProduct) {
		
		ResultUtil result = null;
		try {
			result = goodproductService.selectByStatus(goodProduct);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return JSONArray.fromObject(result).toString();	
	}

}
