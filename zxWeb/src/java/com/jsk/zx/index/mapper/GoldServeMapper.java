/**
 * 
 */

package com.jsk.zx.index.mapper;
import java.util.List;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.index.model.JskIndexGoldServe;

public interface GoldServeMapper  extends IBaseMapper{

	public List<JskIndexGoldServe> findGoldServe();
	
	public List<JskIndexGoldServe> selectGoldServeDetilById(int pkId);


}
