/**
 * 
 */

package com.jsk.zx.index.mapper;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.index.model.JskIndexProduct;
import com.jsk.zx.index.model.JskIndexRecommend;
import com.jsk.zx.index.model.JskIndexService;
import com.jsk.zx.index.model.JskIndexTopNews;
import com.jsk.zx.index.model.JskIndexTroll;
import com.jsk.zx.index.model.JskIndexWork;
import com.jsk.zx.index.model.JskServiceWork;
import com.jsk.zx.person.model.JskPersonMarket;

public interface JskInsertMapper extends IBaseMapper {

	int insertService(JskIndexService jskIndexService);

	int insertProduct(JskIndexProduct jskIndexProduct);

	int insertMarket(JskPersonMarket jskPersonMarket);

	int insertRecommendProduct(JskIndexRecommend jskIndexRecommend);

	int insertTroll(JskIndexTroll jskIndexTroll);
	
	int insertTopNews(JskIndexTopNews jskIndexTopNews);
	
	int insertWorkType(JskIndexWork jskIndexWork);
	
	int insertServiceWork(JskServiceWork jskServiceWork);
}
