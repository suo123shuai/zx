/**
 * 
 */
package com.jsk.zx.demo.service;

import java.util.List;

import com.jsk.base.common.PageBean;
import com.jsk.zx.demo.model.Demo;

/**
 * @Title: IDemoService.java
 * @Description: 例子 
 * @author: lizp
 * @date: 2018-6-7 下午9:43:57
 */
public interface IDemoService {

	/**
	 * @Title: selectList
	 * @Description: 分页查询数据
	 * @author: lizp
	 * @date: 2018-6-7 
	 * @param demo
	 * @param pageBean
	 * @return
	 */
	public List<Demo> selectList(Demo demo, PageBean pageBean) throws Exception;
	
	/**
	 * @Title: getTotalRows
	 * @Description: 查询总条数
	 * @author: lizp
	 * @date: 2018-6-7 
	 * @param demo
	 * @return
	 */
	public long getTotalRows(Demo demo) throws Exception;
}
