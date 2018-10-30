/**
 * 
 */

package com.jsk.zx.index.service;
import com.jsk.zx.login.common.ResultUtil;

public interface IGoldServeService {

	public ResultUtil findGoldServe() throws Exception;
	
	public ResultUtil selectGoldServeDetilById(int pkId) throws Exception;


}
