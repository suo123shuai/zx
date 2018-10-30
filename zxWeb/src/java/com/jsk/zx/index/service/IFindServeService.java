/**
 * 
 */

package com.jsk.zx.index.service;

import com.jsk.zx.login.common.ResultUtil;

public interface IFindServeService {

	public ResultUtil selectService(String type,String serviceSign) throws Exception;

	public ResultUtil findMyService(Integer userId) throws Exception;
	
	public ResultUtil findServiceDetail(int pkId) throws Exception;
	
	public ResultUtil searchServiceByTitle(String title) throws Exception;

}
