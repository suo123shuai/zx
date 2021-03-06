/**
 * 
 */


package com.jsk.zx.index.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.service.BaseService;
import com.jsk.zx.index.mapper.RecommendMapper;
import com.jsk.zx.index.model.JskIndexRecommend;
import com.jsk.zx.index.service.IRecommendService;
import com.jsk.zx.login.common.ResultUtil;


@Service("recommendServiceImpl")
public  class RecommendServiceImpl extends BaseService implements IRecommendService{
	
	
	@Autowired
	private RecommendMapper recommendMapper;

	@Override
	public ResultUtil selectRecommend() throws Exception {
		ResultUtil retu = new ResultUtil();
		
			List<JskIndexRecommend> list = recommendMapper.selectRecommend();
			if (list != null && !list.isEmpty()) {
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			} else {
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("没有推荐项目");
			}
			return retu;
	}

}
