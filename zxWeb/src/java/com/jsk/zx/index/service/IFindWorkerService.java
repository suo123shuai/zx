/**
 * 
 */

package com.jsk.zx.index.service;
import com.jsk.zx.login.common.ResultUtil;

public interface IFindWorkerService {

	 ResultUtil selectWorker(int pkId,String findType) throws Exception;
	 
	 ResultUtil searchWorker(String userName) throws Exception;

	 ResultUtil findShop() throws Exception;
	 
	 ResultUtil selectWorkerById(int pkId) throws Exception;
}
