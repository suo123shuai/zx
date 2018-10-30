package com.jsk.zx.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.login.service.IPhotoService;

/**
 * @Title: PhotoController.java
 * @Description: 添加图片
 * 
 */
@Controller
@RequestMapping("/photo")
public class PhotoController extends BaseController {

	@Autowired
	private IPhotoService photoService;

	@RequestMapping("/add")
	@ResponseBody
	/**
	 * 
	 *@Title: addPhotoGetPkID.java
	 * @Description: 添加图片并的到该图片的pkId
	 */
	public String addPhotoGetPkID(MultipartFile file, String type,
			HttpServletRequest request) throws Exception {
		ResultUtil resultUtil = photoService.addPhotoGetPkID(file, type,
				request);
		return JSON.toJSONString(resultUtil);
	}
}
