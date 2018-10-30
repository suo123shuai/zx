/**
 * 
 */

package com.jsk.zx.index.service;

import com.jsk.zx.login.common.ResultUtil;

public interface IFindProductService {

	public ResultUtil selectProductByYcys() throws Exception;

	public ResultUtil selectProductById(int pkId) throws Exception;

	public ResultUtil selectProductByQxdp() throws Exception;

	public ResultUtil selectProductByWjjc() throws Exception;

	public ResultUtil selectProductByJjby() throws Exception;

	public ResultUtil selectProductByTc() throws Exception;

	public ResultUtil selectProductByType(String type) throws Exception;
	
	public ResultUtil findMyProduct(int userId) throws Exception;
	
	public ResultUtil findMyProductUserInfo(int userId) throws Exception;
	
	public ResultUtil findRecommendProduct() throws Exception;

}
