/**
 * 
 */
package com.jsk.zx.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jsk.base.common.PageBean;
import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.demo.model.Demo;

/**
 * @Title: DemoMapper.java
 * @Description: DAO
 * @author: lizp
 * @date: 2018-6-7 下午9:46:55
 */
public interface IDemoMapper extends IBaseMapper {

	/**
	 * @Title: selectList
	 * @Description: 分页查询数据
	 * @author: lizp
	 * @date: 2018-6-7
	 * @param demo
	 * @param pageBean
	 * @return
	 */
	public List<Demo> selectList(@Param("demo") Demo demo, @Param("pageBean") PageBean pageBean);

	/**
	 * @Title: getTotalRows
	 * @Description: 查询总条数
	 * @author: lizp
	 * @date: 2018-6-7
	 * @param demo
	 * @return
	 */
	public long getTotalRows(Demo demo);
}
