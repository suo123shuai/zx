package com.jsk.zx.index.controller;

import net.sf.json.JSONArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsk.base.controller.BaseController;
import com.jsk.zx.index.model.JskIndexKnowledge;
import com.jsk.zx.index.service.IKnowledgeService;
import com.jsk.zx.login.common.ResultUtil;

/**
 * @Title: KnowledgeController.java
 * @Description: 装修小常识
 * @author: lihao
 * @date: 2018-6-14 
 */

@Controller
@RequestMapping("/knowledgeService")
public class KnowledgeController extends BaseController{
	@Autowired
	private IKnowledgeService knowledgeService;

	/*根据项目状态将已发布的裝修小常识查询出来*/
	@ResponseBody
	@RequestMapping("/selectByStatus")
	public String selectByStatus(JskIndexKnowledge knowledge) {
		
		ResultUtil result = null;
		try {
			result = knowledgeService.selectByStatus(knowledge);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return JSONArray.fromObject(result).toString();	
	}

}
