/**
 * 
 */


package com.jsk.zx.index.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.service.BaseService;
import com.jsk.zx.index.mapper.TrollMapper;
import com.jsk.zx.index.model.JskIndexTroll;
import com.jsk.zx.index.service.ITrollService;
import com.jsk.zx.login.common.ResultUtil;


@Service("trollServiceImpl")
public  class TrollServiceImpl extends BaseService implements ITrollService{
	
	
	@Autowired
	private TrollMapper trollMapper;

	@Override
	public ResultUtil selectAll() throws Exception {
		ResultUtil retu = new ResultUtil();
		
			List<JskIndexTroll> list = trollMapper.selectAll();
			if(list !=null && !list.isEmpty()){
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			}else{
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("轮播模块没有内容");
			}
			return retu;
	}

}
