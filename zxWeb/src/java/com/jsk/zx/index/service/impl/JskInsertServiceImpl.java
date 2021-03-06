package com.jsk.zx.index.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.zx.index.mapper.JskInsertMapper;
import com.jsk.zx.index.model.JskIndexProduct;
import com.jsk.zx.index.model.JskIndexRecommend;
import com.jsk.zx.index.model.JskIndexService;
import com.jsk.zx.index.model.JskIndexTopNews;
import com.jsk.zx.index.model.JskIndexTroll;
import com.jsk.zx.index.model.JskIndexWork;
import com.jsk.zx.index.model.JskServiceWork;
import com.jsk.zx.index.service.IJskInsertService;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.model.JskPersonMarket;

@Service
public class JskInsertServiceImpl implements IJskInsertService {

	@Autowired
	JskInsertMapper jskInsertMapper;

	@Override
	/**
	 * insertService,添加服务或者工作
	 */
	public ResultUtil insertService(JskIndexService jskIndexService,
			HttpServletRequest request) throws Exception {
		ResultUtil resu = new ResultUtil();
		try {
			List<Integer> list = new ArrayList<Integer>();
			jskIndexService.setCreateTime(new Date());
			int i = jskInsertMapper.insertService(jskIndexService);
			if (i != 0) {
				resu.setId(0);
				list.add(jskIndexService.getPkId());
				resu.setData(list);
				resu.setMsg("服务添加成功，返回添加服务的pkId");
			} else {
				resu.setId(1);
				resu.setMsg("服务添加失败fwtjsb");
			}
		} catch (Exception e) {
			resu.setId(2);
			resu.setMsg("服务添加失败");
			e.printStackTrace();
		}
		return resu;
	}
	
	
	/**
	 * insertWorkType,添加工种
	 */
	@Override
	public ResultUtil insertWorkType(JskIndexWork jskIndexWork,
			HttpServletRequest request) throws Exception {
		ResultUtil resu = new ResultUtil();
		try {
			List<Integer> list = new ArrayList<Integer>();
			jskIndexWork.setCreateTime(new Date());
			int i = jskInsertMapper.insertWorkType(jskIndexWork);
			if (i != 0) {
				resu.setId(0);
				list.add(jskIndexWork.getPkId());
				resu.setData(list);
				resu.setMsg("工种添加成功，返回添加产品的pkId");
			} else {
				resu.setId(1);
				resu.setMsg("工种添加失败");
			}
		} catch (Exception e) {
			resu.setId(2);
			resu.setMsg("工种添加失败，参数为空");
			e.printStackTrace();
		}
		return resu;
	}
	
	/**
	 * insertWorkType,添加服务工种
	 */
	@Override
	public ResultUtil insertServiceWork(JskServiceWork jskServiceWork,
			HttpServletRequest request) throws Exception {
		ResultUtil resu = new ResultUtil();
		try {
			List<Integer> list = new ArrayList<Integer>();
			int i = jskInsertMapper.insertServiceWork(jskServiceWork);
			if (i != 0) {
				resu.setId(0);
				list.add(jskServiceWork.getPkId());
				resu.setData(list);
				resu.setMsg("服务工种添加成功，返回添加产品的pkId");
			} else {
				resu.setId(1);
				resu.setMsg("服务工种添加失败");
			}
		} catch (Exception e) {
			resu.setId(2);
			resu.setMsg("服务工种添加失败，参数为空");
			e.printStackTrace();
		}
		return resu;
	}

	/**
	 * insertProduct,添加产品
	 */
	@Override
	public ResultUtil insertProduct(JskIndexProduct jskIndexProduct,
			HttpServletRequest request) throws Exception {
		ResultUtil resu = new ResultUtil();
		try {
			List<Integer> list = new ArrayList<Integer>();
			jskIndexProduct.setCreateTime(new Date());
			int i = jskInsertMapper.insertProduct(jskIndexProduct);
			if (i != 0) {
				resu.setId(0);
				list.add(jskIndexProduct.getPkId());
				resu.setData(list);
				resu.setMsg("服务产品成功，返回添加产品的pkId");
			} else {
				resu.setId(1);
				resu.setMsg("产品添加失败cptjsb");
			}
		} catch (Exception e) {
			resu.setId(2);
			resu.setMsg("产品添加失败");
			e.printStackTrace();
		}
		return resu;
	}

	/**
	 * insertMarket,添加积分商城
	 */
	@Override
	public ResultUtil insertMarket(JskPersonMarket jskPersonMarket,
			HttpServletRequest request) throws Exception {
		ResultUtil resu = new ResultUtil();
		try {
			List<Integer> list = new ArrayList<Integer>();
			jskPersonMarket.setCreateTime(new Date());
			int i = jskInsertMapper.insertMarket(jskPersonMarket);
			if (i != 0) {
				resu.setId(1);
				list.add(jskPersonMarket.getPkId());
				resu.setData(list);
				resu.setMsg("积分商城添加成功，返回pkId");
			} else {
				resu.setId(0);
				resu.setMsg("积分商城添加失败jfsctjsb");
			}
		} catch (Exception e) {
			resu.setId(2);
			resu.setMsg("积分商城添加失败");
			e.printStackTrace();
		}
		return resu;
	}

	/**
	 * insertRecommendProduct,添加商品推荐中的商品
	 */
	@Override
	public ResultUtil insertRecommendProduct(
			JskIndexRecommend jskIndexRecommend, HttpServletRequest request)
			throws Exception {
		ResultUtil resu = new ResultUtil();
		try {
			List<Integer> list = new ArrayList<Integer>();
			jskIndexRecommend.setCreateTime(new Date());
			int i = jskInsertMapper.insertRecommendProduct(jskIndexRecommend);
			if (i != 0) {
				resu.setId(1);
				list.add(jskIndexRecommend.getPkId());
				resu.setData(list);
				resu.setMsg("推荐商品添加成功，返回添加产品的pkId");
			} else {
				resu.setId(0);
				resu.setMsg("产品添加失败cptjsb");
			}
		} catch (Exception e) {
			resu.setId(2);
			resu.setMsg("产品添加失败");
			e.printStackTrace();
		}
		return resu;
	}

	/**
	 * insertTroll,添加轮播中的商品
	 */
	@Override
	public ResultUtil insertTroll(JskIndexTroll jskIndexTroll,
			HttpServletRequest request) throws Exception {
		ResultUtil resu = new ResultUtil();
		try {
			List<Integer> list = new ArrayList<Integer>();
			jskIndexTroll.setCreateTime(new Date());
			int i = jskInsertMapper.insertTroll(jskIndexTroll);
			if (i != 0) {
				resu.setId(1);
				list.add(jskIndexTroll.getPkId());
				resu.setData(list);
				resu.setMsg("轮播商品添加成功，返回添加产品的pkId");
			} else {
				resu.setId(0);
				resu.setMsg("产品添加失败cptjsb");
			}
		} catch (Exception e) {
			resu.setId(2);
			resu.setMsg("产品添加失败");
			e.printStackTrace();
		}
		return resu;
	}
	
	/**
	 * insertTroll,添加轮播中的商品
	 */
	@Override
	public ResultUtil insertTopNews(JskIndexTopNews jskIndexTopNews,
			HttpServletRequest request) throws Exception {
		ResultUtil resu = new ResultUtil();
		try {
			List<Integer> list = new ArrayList<Integer>();
			jskIndexTopNews.setCreateTime(new Date());
			int i = jskInsertMapper.insertTopNews(jskIndexTopNews);
			if (i != 0) {
				resu.setId(0);
				list.add(jskIndexTopNews.getPkId());
				resu.setData(list);
				resu.setMsg("大时圈添加成功，返回添加产品的pkId");
			} else {
				resu.setId(1);
				resu.setMsg("大时圈添加失败dsqtjsb");
			}
		} catch (Exception e) {
			resu.setId(2);
			resu.setMsg("大时圈添加失败");
			e.printStackTrace();
		}
		return resu;
	}
}