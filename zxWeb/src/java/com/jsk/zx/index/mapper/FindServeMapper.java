/**
 * 
 */

package com.jsk.zx.index.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.index.model.JskIndexFindServe;

public interface FindServeMapper extends IBaseMapper {

	public List<JskIndexFindServe> selectService(String serviceSign);
	
	public List<JskIndexFindServe> selectServiceByType(@Param(value="type")String type,@Param(value="serviceSign")String serviceSign);

	public List<JskIndexFindServe> findMyService(Integer userId);
	
	public List<JskIndexFindServe> findServiceDetail(int pkId);
	
	public List<JskIndexFindServe> searchService(String title);
}
