/**
 * 
 */

package com.jsk.zx.index.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.service.BaseService;
import com.jsk.zx.index.mapper.FindServeMapper;
import com.jsk.zx.index.model.JskIndexFindServe;
import com.jsk.zx.index.service.IFindServeService;
import com.jsk.zx.login.common.ResultUtil;

@Service("findServeServiceImpl")
public class FindServeServiceImpl extends BaseService implements
		IFindServeService {

	@Autowired
	private FindServeMapper findServeMapper;

	@Override
	public ResultUtil selectService(String type,String serviceSign) throws Exception {
		ResultUtil retu = new ResultUtil();
		if (type != null && !"".equals(type)) {
			if(type.equals("0")){
				List<JskIndexFindServe> list = findServeMapper.selectService(serviceSign);
				if (list != null && !list.isEmpty()) {
					retu.setId(0);
					retu.setData(list);
					retu.setMsg("成功");
				} else {
					retu.setId(1);
					retu.setData(list);
					retu.setMsg("没有合适的服务");
				}
			}else{
				List<JskIndexFindServe> list = findServeMapper.selectServiceByType(type,serviceSign);
				if (list != null && !list.isEmpty()) {
					retu.setId(0);
					retu.setData(list);
					retu.setMsg("成功");
				} else {
					retu.setId(1);
					retu.setData(list);
					retu.setMsg("没有合适的服务");
				}
			}
		}
		return retu;
	}

	@Override
	public ResultUtil findMyService(Integer userId) throws Exception {
		ResultUtil retu = new ResultUtil();

		List<JskIndexFindServe> list = findServeMapper.findMyService(userId);
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有服务");
		}
		return retu;
	}
	
	@Override
	public ResultUtil findServiceDetail(int pkId) throws Exception {
		ResultUtil retu = new ResultUtil();

		List<JskIndexFindServe> list = findServeMapper.findServiceDetail(pkId);
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有找到该服务");
		}
		return retu;
	}
	
	@Override
	public ResultUtil searchServiceByTitle(String title) throws Exception {
		ResultUtil retu = new ResultUtil();

		List<JskIndexFindServe> list = findServeMapper.searchService(title);
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有找到该服务");
		}
		return retu;
	}


}
