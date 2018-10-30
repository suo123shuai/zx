/**
 * 
 */


package com.jsk.zx.index.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.service.BaseService;
import com.jsk.zx.index.mapper.GoldServeMapper;
import com.jsk.zx.index.model.JskIndexGoldServe;
import com.jsk.zx.index.service.IGoldServeService;
import com.jsk.zx.login.common.ResultUtil;


@Service("goldServeServiceImpl")
public  class GoldServeServiceImpl extends BaseService implements IGoldServeService{
	
	
	@Autowired
	private GoldServeMapper goldServeMapper;

	@Override
	public ResultUtil findGoldServe() throws Exception {
		ResultUtil retu = new ResultUtil();
		
			List<JskIndexGoldServe> list = goldServeMapper.findGoldServe();
			if (list != null && !list.isEmpty()) {
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			} else {
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("没有查询到金牌服务");
			}
			return retu;
	}
	
	@Override
	public ResultUtil selectGoldServeDetilById(int pkId) throws Exception {
		ResultUtil retu = new ResultUtil();
		
			List<JskIndexGoldServe> list = goldServeMapper.selectGoldServeDetilById(pkId);
			if (list != null && !list.isEmpty()) {
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			} else {
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("详情查询失败");
			}
			return retu;
	}

}
