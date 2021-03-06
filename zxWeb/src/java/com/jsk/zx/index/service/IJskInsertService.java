package com.jsk.zx.index.service;

import javax.servlet.http.HttpServletRequest;

import com.jsk.zx.index.model.JskIndexProduct;
import com.jsk.zx.index.model.JskIndexRecommend;
import com.jsk.zx.index.model.JskIndexService;
import com.jsk.zx.index.model.JskIndexTopNews;
import com.jsk.zx.index.model.JskIndexTroll;
import com.jsk.zx.index.model.JskIndexWork;
import com.jsk.zx.index.model.JskServiceWork;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.model.JskPersonMarket;

public interface IJskInsertService {
	/**
	 * insertService方法，添加服务并返回的PkId
	 * 
	 * @param jskIndexService
	 * @return
	 * @throws Exception
	 */

	ResultUtil insertService(JskIndexService jskIndexService,
			HttpServletRequest request) throws Exception;
	
	
	/**
	 * insertServiceWork方法，添加工种并返回的PkId
	 * 
	 * @param insertServiceWork
	 * @return
	 * @throws Exception
	 */

	ResultUtil insertServiceWork(JskServiceWork jskServiceWork,
			HttpServletRequest request) throws Exception;
	
	/**
	 * insertWorkType方法，添加工种并返回的PkId
	 * 
	 * @param insertWorkType
	 * @return
	 * @throws Exception
	 */

	ResultUtil insertWorkType(JskIndexWork jskIndexWork,
			HttpServletRequest request) throws Exception;

	/**
	 * insertProduct方法，添加产品并返回的PkId
	 * 
	 * @param jskIndexProduct
	 * @return
	 * @throws Exception
	 */

	ResultUtil insertProduct(JskIndexProduct jskIndexProduct,
			HttpServletRequest request) throws Exception;

	/**
	 * insertMarket方法，添加产品并返回的PkId
	 * 
	 * @param jskPersonMarket
	 * @return
	 * @throws Exception
	 */

	ResultUtil insertMarket(JskPersonMarket jskPersonMarket,
			HttpServletRequest request) throws Exception;

	/**
	 * insertRecommendProduct方法，添加产品并返回的PkId
	 * 
	 * @param insertRecommendProduct
	 * @return
	 * @throws Exception
	 */

	ResultUtil insertRecommendProduct(JskIndexRecommend jskIndexRecommend,
			HttpServletRequest request) throws Exception;

	/**
	 * insertTroll方法，添加产品并返回的PkId
	 * 
	 * @param insertTroll
	 * @return
	 * @throws Exception
	 */

	ResultUtil insertTroll(JskIndexTroll jskIndexTroll,
			HttpServletRequest request) throws Exception;
	
	/**
	 * inserTopNews方法，添加大时圈并返回的PkId
	 * 
	 * @param inserTopNews
	 * @return
	 * @throws Exception
	 */

	ResultUtil insertTopNews(JskIndexTopNews skIndexTopNews,
			HttpServletRequest request) throws Exception;
}
