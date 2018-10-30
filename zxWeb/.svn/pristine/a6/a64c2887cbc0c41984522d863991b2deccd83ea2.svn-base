/**
 * 
 */
package com.jsk.zx.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsk.base.common.PageBean;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.demo.model.Demo;
import com.jsk.zx.demo.service.IDemoService;

/**
 * @Title: DemoController.java
 * @Description: 例子
 * @author: lizp
 * @date: 2018-6-7 上午12:25:27
 */
@Controller
@RequestMapping("/secure/demo")
public class DemoController extends BaseController {

	@Autowired
	private IDemoService demoService;

	/**
	 * @Title: selectList
	 * @Description:
	 * @author: lizp
	 * @date: 2018-6-9
	 * @param demo
	 * @param pageBean
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView selectList(Demo demo, PageBean pageBean) {
		ModelAndView mav = new ModelAndView("/jsk/zx/demo/demo_list");
		try {
			pageBean.setTotalRows(demoService.getTotalRows(demo));
			mav.addObject("pageBean", pageBean);
			mav.addObject("demoList", demoService.selectList(demo, pageBean));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return mav;
	}

	/**
	 * @Title: create
	 * @Description: 新增
	 * @author: lizp
	 * @date: 2018年6月13日
	 * @return
	 */
	@RequestMapping("/create")
	public ModelAndView create() {
		ModelAndView mav = new ModelAndView("/jsk/zx/demo/demo_form");
		return mav;
	}

	/**
	 * @Title: save
	 * @Description: 保存数据
	 * @author: lizp
	 * @date: 2018年6月14日
	 * @param demo
	 * @return
	 */
	@RequestMapping("/save")
	public ModelAndView save(Demo demo) {
		ModelAndView mav = new ModelAndView("forward:list");
		// 如果需要这里添加验证，如果验证失败重新设置viewName，如mav.setViewName("/jsk/zx/demo/demo_form");
		return mav;
	}

	public String delete() {
		return null;
	}

	/**
	 * @Title: edit
	 * @Description: 根据ID查询数据
	 * @author: lizp
	 * @date: 2018年6月13日
	 * @param pkId
	 * @return
	 */
	@RequestMapping("/edit")
	public ModelAndView edit(String pkId) {
		ModelAndView mav = new ModelAndView();
		return mav;
	}

}
