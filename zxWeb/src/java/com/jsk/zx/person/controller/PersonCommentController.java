package com.jsk.zx.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.model.JskPersonComment;
import com.jsk.zx.person.model.JskPersonCommentDetail;
import com.jsk.zx.person.service.IJskPersonCommentService;

@Controller
@RequestMapping("/comment")
public class PersonCommentController extends BaseController{

	@Autowired
	private IJskPersonCommentService  PersonCommentService;
	
	@RequestMapping("/comment")
	@ResponseBody
	public String findByRecordId(Integer recordId, String type){
		ResultUtil resu = new ResultUtil();
		try {
			resu = PersonCommentService.findByRecordId(recordId, type);
			return JSON.toJSONString(resu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resu.setId(3);
		resu.setMsg("查询失败");
		return JSON.toJSONString(resu);
	}
	
	@ResponseBody
	@RequestMapping("/saveComment")
	public String saveComment(JskPersonComment jskPersonComment){
		String content = jskPersonComment.getContent();
		jskPersonComment.setContent(content);
		ResultUtil resu = new ResultUtil();
		try {
			resu = PersonCommentService.saveComment(jskPersonComment);
			return JSON.toJSONString(resu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resu.setId(3);
		resu.setMsg("评论失败");
		return JSON.toJSONString(resu);
	}
	
	@ResponseBody
	@RequestMapping("/saveDetail")
	public String saveCommentDetail(JskPersonCommentDetail jskPersonCommentDetail){
		String content = jskPersonCommentDetail.getContent();
		jskPersonCommentDetail.setContent(content);
		ResultUtil resu = new ResultUtil();
		try {
			resu = PersonCommentService.saveCommentDetail(jskPersonCommentDetail);
			return JSON.toJSONString(resu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resu.setId(3);
		resu.setMsg("回复评论失败");
		return JSON.toJSONString(resu);
	}
	
	@RequestMapping("/delect")
	@ResponseBody
	public String deleteComment(Integer commentId){
		ResultUtil resu = new ResultUtil();
		try {
			resu = PersonCommentService.deleteComment(commentId);
			return JSON.toJSONString(resu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resu.setId(3);
		resu.setMsg("删除评论失败");
		return JSON.toJSONString(resu);
	}
	
	@RequestMapping("/delectDetail")
	@ResponseBody
	public String deleteCommentDetail(Integer pkId){
		ResultUtil resu = new ResultUtil();
		try {
			resu = PersonCommentService.deleteCommentDetail(pkId);
			return JSON.toJSONString(resu);
		} catch (Exception e) {
			e.printStackTrace();
		}
		resu.setId(3);
		resu.setMsg("删除评论失败");
		return JSON.toJSONString(resu);
	}
}
