/**
 * 
 */
package com.jsk.zx.sys.index.mapper;

import com.jsk.zx.index.model.JskIndexRecommend;
import com.mltt.core.mapper.IBaseEntityMapper;

/**
 * @Title: IJskIndexRecommendMapper.java
 * @Description: TODO 
 * @author: lizp
 * @date: 2018年7月30日 下午5:32:51
 */
public interface IJskIndexRecommendMapper extends IBaseEntityMapper<JskIndexRecommend>{

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
