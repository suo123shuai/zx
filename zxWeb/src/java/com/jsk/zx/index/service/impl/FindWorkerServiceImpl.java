/**
 * 
 */

package com.jsk.zx.index.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.service.BaseService;
import com.jsk.zx.index.mapper.FindWorkerMapper;
import com.jsk.zx.index.model.JskIndexFindWorker;
import com.jsk.zx.index.service.IFindWorkerService;
import com.jsk.zx.login.common.ResultUtil;

@Service("findWorkerServiceImpl")
public class FindWorkerServiceImpl extends BaseService implements
		IFindWorkerService {

	@Autowired
	private FindWorkerMapper findWorkerMapper;

	@Override
	public ResultUtil selectWorker(int pkId, String findType) throws Exception {
		ResultUtil retu = new ResultUtil();
		// 最新注册
		if (findType.equals("1")) {
			List<JskIndexFindWorker> list = findWorkerMapper
					.findWorkerByTheNewLogin();
			if (list != null && !list.isEmpty()) {
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			} else {
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("没有合适的工人");
			}
		}
		// 离我最近
		if (findType.equals("2")) {
			List<JskIndexFindWorker> list = findWorkerMapper
					.findWorkerByTheNearest(pkId);
			if (list != null && !list.isEmpty()) {
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			} else {
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("没有合适的工人");
			}
		}
		// 点赞最多
		if (findType.equals("3")) {
			List<JskIndexFindWorker> list = findWorkerMapper
					.findWorkerByTheMostPraise();
			if (list != null && !list.isEmpty()) {
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			} else {
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("没有合适的工人");
			}
		}
		// 所有工人
		if (findType.equals("0")) {
			List<JskIndexFindWorker> list = findWorkerMapper.findWorker();
			if (list != null && !list.isEmpty()) {
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			} else {
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("没有合适的工人");
			}
		}

		return retu;
	}
	
	public ResultUtil findShop() throws Exception {
		ResultUtil retu = new ResultUtil();
		List<JskIndexFindWorker> list=findWorkerMapper.findShop();
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有商户");
		}
		return retu;
	}
	
	
	public ResultUtil selectWorkerById(int pkId) throws Exception {
		ResultUtil retu = new ResultUtil();
		List<JskIndexFindWorker> list=findWorkerMapper.selectWorkerById(pkId);
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
	
	
	public ResultUtil searchWorker(String userName) throws Exception {
		ResultUtil retu = new ResultUtil();
		List<JskIndexFindWorker> list=findWorkerMapper.searchWorker(userName);
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
