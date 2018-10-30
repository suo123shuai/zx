package com.jsk.zx.index.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.service.BaseService;
import com.jsk.zx.index.mapper.JskIndexNewsMapper;
import com.jsk.zx.index.mapper.JskIndexUserNewsMapper;
import com.jsk.zx.index.model.JskIndexNews;
import com.jsk.zx.index.model.JskIndexUserNews;
import com.jsk.zx.index.service.IJskIndexNewsService;
import com.jsk.zx.login.common.ResultUtil;

@Service
public class JskIndexNewsServiceImpl extends BaseService implements IJskIndexNewsService {

	@Autowired
	private JskIndexNewsMapper jskIndexNewsMapper;
	@Autowired
	private JskIndexUserNewsMapper userNewsMapper;

	@Override
	public ResultUtil findByType() throws Exception {
		ResultUtil retu = new ResultUtil();
			List<JskIndexNews> list = jskIndexNewsMapper.findByType();
			if(list == null || list.size() == 0){
				retu.setId(1);
				retu.setMsg("未查到消息");
				return retu;
			}else{
				retu.setId(0);
				retu.setData(list);
				return retu;
			}
	}

	@Override
	public ResultUtil findByUsertype(Integer userId) {
		ResultUtil resu = new ResultUtil();
		List<JskIndexUserNews> list = userNewsMapper.selectByNewsKey(userId);
		if(null == list || list.size() == 0){
			resu.setId(1);
			resu.setMsg("没有新消息");
			return resu;
		}
		resu.setId(0);
		resu.setMsg("ok");
		resu.setData(list);
		return resu;
	}

	@Override
	public ResultUtil saveNews(JskIndexNews jskIndexNews) {
		ResultUtil resu = new ResultUtil();
		int i = jskIndexNewsMapper.insertSelective(jskIndexNews);
		if(i > 0){
			resu.setId(1);
			resu.setMsg("cherub失败");
			return resu;
		}
		resu.setId(0);
		resu.setMsg("ok");
		return resu;
	}
	
	
}