/**
 * 
 */


package com.jsk.zx.index.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.service.BaseService;
import com.jsk.zx.index.mapper.FindWorkMapper;
import com.jsk.zx.index.model.JskIndexFindWork;
import com.jsk.zx.index.service.IFindWorkService;
import com.jsk.zx.login.common.ResultUtil;


@Service("findWorkServiceImpl")
public  class FindWorkServiceImpl extends BaseService implements IFindWorkService{
	
	
	@Autowired
	private FindWorkMapper findWorkMapper;

	@Override
	public ResultUtil selectWork() throws Exception {
		ResultUtil retu = new ResultUtil();
		
			List<JskIndexFindWork> list = findWorkMapper.selectWork();
			if (list != null && !list.isEmpty()) {
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			} else {
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("没有合适的工作");
			}
			return retu;
	}
	
	@Override
	public ResultUtil findWorkByRequire(String address,String title) throws Exception {
		ResultUtil retu = new ResultUtil();
			List<JskIndexFindWork> list = findWorkMapper.findWorkByRequire(address,title);
			if (list != null && !list.isEmpty()) {
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			} else {
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("没有合适的工作");
			}
			return retu;
	}
	
	@Override
	public ResultUtil selectWorkById(int pkId) throws Exception {
		ResultUtil retu = new ResultUtil();
		
			List<JskIndexFindWork> list = findWorkMapper.selectWorkById(pkId);
			if (list != null && !list.isEmpty()) {
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			} else {
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("查询详情失败");
			}
			return retu;
	}

}
