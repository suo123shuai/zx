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
import com.jsk.zx.index.service.IFindProductService;
import com.jsk.zx.login.common.ResultUtil;

import net.sf.json.JSONObject;

/**
 * @Title: FindServiceController.java
 * @Description: 找产品
 * @author: liuyan
 * 
 */
@Controller
@RequestMapping("/findProduct")
public class FindProductController extends BaseController {

	@Autowired
	private IFindProductService findProductService;

	@RequestMapping("/selectProduct")
	@ResponseBody
	public String selectProductByType(String type) {
		ResultUtil re = new ResultUtil();
		try {
			re = findProductService.selectProductByType(type);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	
	// 我的动态  店铺用户的商品信息
		@RequestMapping("/findMyProduct")
		@ResponseBody
		public String findMyProduct(int userId) {
			ResultUtil re = new ResultUtil();
			try {
				re = findProductService.findMyProduct(userId);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return JSON.toJSONString(re);
		}
		
		// 我的动态  店铺用户的用户信息
				@RequestMapping("/findMyProductUserInfo")
				@ResponseBody
				public String findMyProductUserInfo(int userId) {
					ResultUtil re = new ResultUtil();
					try {
						re = findProductService.findMyProductUserInfo(userId);

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return JSON.toJSONString(re);
				}


	// 产品详情
	@RequestMapping("/findProductDetailById")
	@ResponseBody
	public String findProductDetailById(int pkId) {
		ResultUtil re = new ResultUtil();
		try {
			re = findProductService.selectProductById(pkId);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(re);
	}
	
	    //查询推荐商品
		@RequestMapping("/findRecommendProduct")
		@ResponseBody
		public String findRecommendProduct() {
			ResultUtil re = new ResultUtil();
			try {
				re = findProductService.findRecommendProduct();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return JSON.toJSONString(re);
		}

	// 玉石玉材类型
	@RequestMapping("/selectProductByYcys")
	@ResponseBody
	public String selectProductByYcys() {
		ResultUtil re = new ResultUtil();
		try {
			re = findProductService.selectProductByYcys();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSONObject.fromObject(re).toString();
	}

	// 清洗地坪类型
	@RequestMapping("/selectProductByQxdp")
	@ResponseBody
	public String selectProductByQxdp() {
		ResultUtil re = new ResultUtil();
		try {
			re = findProductService.selectProductByQxdp();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSONObject.fromObject(re).toString();
	}

	// 五金建材类型
	@RequestMapping("/selectProductByWjjc")
	@ResponseBody
	public String selectProductByWjjc() {
		ResultUtil re = new ResultUtil();
		try {
			re = findProductService.selectProductByWjjc();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSONObject.fromObject(re).toString();
	}

	// 家居布艺类型
	@RequestMapping("/selectProductByJjby")
	@ResponseBody
	public String selectProductByJjby() {
		ResultUtil re = new ResultUtil();
		try {
			re = findProductService.selectProductByJjby();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSONObject.fromObject(re).toString();
	}

	// 陶瓷类型
	@RequestMapping("/selectProductByTc")
@ResponseBody
	public String selectProductByTc() {
		ResultUtil re = new ResultUtil();
		try {
			re = findProductService.selectProductByTc();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSONObject.fromObject(re).toString();
	}
	

}