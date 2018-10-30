package com.jsk.zx.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jsk.base.common.PageBean;
import com.jsk.base.controller.BaseController;
import com.jsk.zx.business.model.JskIndexService;
import com.jsk.zx.business.service.ILeagueService;

@Controller
@RequestMapping("LeagueService")
public class LeagueController extends BaseController{
	@Autowired
	private ILeagueService LeagueService;
	
	/**
	 * @Title: selectList
	 * @Description:加盟合作的展示
	 * @author: lihao
	 * @date: 2018-6-15
	 * @param service
	 * @param pageBean
	 * @return
	 */
	@ResponseBody
	@RequestMapping("selectList")
	public ModelAndView selectList(JskIndexService service, PageBean pageBean) {
		ModelAndView mav = new ModelAndView("/jsk/zx/business/service_list");
		try {
			pageBean.setTotalRows(LeagueService.getTotalRows(service));
			mav.addObject("pageBean", pageBean);
			mav.addObject("serviceList", LeagueService.selectList(service, pageBean));
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return mav;
	}

}
