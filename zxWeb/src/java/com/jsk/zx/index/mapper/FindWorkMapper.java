/**
 * 
 */

package com.jsk.zx.index.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.index.model.JskIndexFindWork;

public interface FindWorkMapper  extends IBaseMapper{

	 List<JskIndexFindWork> selectWork();
	 
	 List<JskIndexFindWork> findWorkByRequire(@Param(value="address")String address,@Param(value="title")String title);

     List<JskIndexFindWork> selectWorkById(int pkId);
}
