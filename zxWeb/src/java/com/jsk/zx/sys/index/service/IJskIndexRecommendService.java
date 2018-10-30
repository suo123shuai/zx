/**
 * 
 */
package com.jsk.zx.sys.index.service;

import com.jsk.zx.index.model.JskIndexRecommend;
import com.jsk.zx.sys.index.model.JskSysIndexProduct;
import com.mltt.core.entity.Page;
import com.mltt.core.service.IEntityService;

/**
 * @Title: IJskIndexRecommendService.java
 * @Description: TODO 
 * @author: lizp
 * @date: 2018年7月30日 下午5:33:23
 */
public interface IJskIndexRecommendService extends IEntityService<JskIndexRecommend>{

	/**
	 * @Title: recommend
	 * @Description: 推荐商品
	 * @author: lizp
	 * @date: 2018年8月1日 
	 * @param pkId
	 * @return
	 */
	public int recommend(Integer pkId);
	
	/**
	 * @Title: unrecommend
	 * @Description: 取消推荐商品
	 * @author: lizp
	 * @date: 2018年8月1日 
	 * @param pkId
	 * @return
	 */
	public int unrecommend(Integer pkId);
	
}
