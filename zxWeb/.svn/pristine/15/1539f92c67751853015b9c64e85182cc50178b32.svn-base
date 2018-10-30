/**
 * 
 */


package com.jsk.zx.index.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.service.BaseService;
import com.jsk.zx.index.mapper.SearchMapper;
import com.jsk.zx.index.model.JskIndexSearch;
import com.jsk.zx.index.service.ISearchService;
import com.jsk.zx.login.common.ResultUtil;


@Service("searchServiceImpl")
public  class SearchServiceImpl extends BaseService implements ISearchService{
	
	
	@Autowired
	private SearchMapper searchMapper;

	@Override
	public ResultUtil findByTitle(String title) throws Exception {
		ResultUtil retu = new ResultUtil();
		if (title != null) {
			List<JskIndexSearch> list = searchMapper.findByTitle(title);
			if(list.size()==0){
				retu.setId(1);
				retu.setMsg("没有合适的产品");
			}else{
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			}
			return retu;
		} else {
			retu.setId(1);
			retu.setMsg("未输入搜索内容");
			return retu;
		}
	}

}
