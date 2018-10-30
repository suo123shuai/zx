package com.jsk.zx.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.person.model.JskPersonShop;
import com.jsk.zx.person.model.ResuUtil;
import com.jsk.zx.person.service.IJskPersonShopService;


@Controller
@RequestMapping("/shop")
public class PersonShopController extends BaseController{

	@Autowired
	private IJskPersonShopService shopService;
	
	@RequestMapping("/add")
	@ResponseBody
	public String addShop(JskPersonShop jskPersonShop) throws Exception{
		ResuUtil resu = shopService.saveJskPersonShop(jskPersonShop);
		return JSON.toJSONString(resu);
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public String saveShop(Integer userId, String type){
		ResuUtil resu = null;
		try {
			resu = shopService.findByUserId(userId, type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(resu);
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delShop(String shopIds){
		ResuUtil resu = null;
		try {
			resu = shopService.deleteByShopId(shopIds);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(resu);
	}
	
	@RequestMapping("/remove")
	@ResponseBody
	public String removeShop(Integer userId){
		ResuUtil resu = null;
		try {
			resu = shopService.deleteByUserId(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return JSON.toJSONString(resu);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String updateShop(JskPersonShop jskPersonShop){
		ResuUtil resu = shopService.updateShop(jskPersonShop);
		return JSON.toJSONString(resu);
	}
}
