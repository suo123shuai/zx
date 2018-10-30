/**
 * 
 */


package com.jsk.zx.index.mapper;
import java.util.List;
import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.index.model.JskIndexSearch;

public interface SearchMapper  extends IBaseMapper{
	
	public List<JskIndexSearch> findByTitle(String title);

}
