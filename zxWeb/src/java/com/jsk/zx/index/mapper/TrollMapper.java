/**
 * 
 */

package com.jsk.zx.index.mapper;
import java.util.List;
import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.index.model.JskIndexTroll;

public interface TrollMapper  extends IBaseMapper{

	public List<JskIndexTroll> selectAll();

}
