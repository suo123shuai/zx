/**
 * 
 */


package com.jsk.zx.index.mapper;
import java.util.List;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.index.model.JskIndexRecommend;

public interface RecommendMapper  extends IBaseMapper{
	
	public List<JskIndexRecommend> selectRecommend();

}
