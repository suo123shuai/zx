package com.jsk.zx.index.service;

import com.jsk.zx.login.common.ResultUtil;

public interface IDaShiQuanService {
	
	public ResultUtil findDaShiQuan() throws Exception;
	
	public ResultUtil findTopNewsDetail( int pkId) throws Exception;

}
