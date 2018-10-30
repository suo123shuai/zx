package com.jsk.zx.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsk.zx.system.model.JskSysAnnex;
import com.jsk.zx.system.service.IAnnexService;

@Controller
@RequestMapping("/annex")
public class AnnexController {

	@Autowired
	private IAnnexService annexService;
	
	@RequestMapping("findby")
	@ResponseBody
	public String findById(Integer pkId){
		JskSysAnnex annex = annexService.findById(pkId);
		return annex.getFilePath();
	}
}
