package com.jsk.zx.index.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.service.BaseService;
import com.jsk.zx.index.mapper.DaShiQuanMapper;
import com.jsk.zx.index.model.JskIndexTopNews;
import com.jsk.zx.index.service.IDaShiQuanService;
import com.jsk.zx.login.common.ResultUtil;

@Service("daShiQuanServiceImpl")
public  class DaShiQuanServiceImpl extends BaseService implements IDaShiQuanService{
	
	
	@Autowired
	private DaShiQuanMapper daShiQuanMapper;

	@Override
	public ResultUtil findDaShiQuan() throws Exception {
		ResultUtil retu = new ResultUtil();
			List<JskIndexTopNews> list = daShiQuanMapper.findDaShiQuan();
			if(list.size()==0){
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("没有合适的产品");
			}else{
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			}
			return retu;
		}
	
	@Override
	public ResultUtil findTopNewsDetail( int pkId) throws Exception {
		ResultUtil retu = new ResultUtil();
			List<JskIndexTopNews> list = daShiQuanMapper.findTopNewsDetailById(pkId);
			if(list.size()==0){
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("没有详情信息");
			}else{
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			}
			return retu;
		}
	}
