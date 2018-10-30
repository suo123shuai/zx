package com.jsk.zx.index.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.zx.index.mapper.GoodproductMapper;
import com.jsk.zx.index.model.JskIndexGoodproduct;
import com.jsk.zx.index.service.IGoodproductService;
import com.jsk.zx.login.common.ResultUtil;

@Service
public class GoodproductServiceImpl implements IGoodproductService{
	@Autowired
	GoodproductMapper goodproductMapper;
	
	@Override
	public ResultUtil selectByStatus(JskIndexGoodproduct goodProduct) throws Exception{
		ResultUtil retu = new ResultUtil();
		List<JskIndexGoodproduct> result = goodproductMapper.selectByStatus(goodProduct);
		if(result.size() == 0){
			retu.setId(1);
			retu.setMsg("项目还未发布");/*查询结果为空时，返回错误信息*/
		}else{
			retu.setId(0);
			retu.setData(result);
		}
		return retu;
	}

}
