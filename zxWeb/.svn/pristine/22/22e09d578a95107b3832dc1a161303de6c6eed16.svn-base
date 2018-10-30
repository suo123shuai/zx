/**
 * 
 */
package com.jsk.zx.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.common.PageBean;
import com.jsk.base.service.BaseService;
import com.jsk.zx.demo.mapper.IDemoMapper;
import com.jsk.zx.demo.model.Demo;
import com.jsk.zx.demo.service.IDemoService;

/**
 * @Title: DemoServiceImpl.java
 * @Description: 例子
 * @author: lizp
 * @date: 2018-6-7 下午9:44:47
 */
@Service("demoServiceImpl")
public class DemoServiceImpl extends BaseService implements IDemoService {

	@Autowired
	private IDemoMapper demoMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jsk.zx.demo.service.IDemoService#selectList(com.jsk.zx.demo.model.Demo, com.jsk.base.common.PageBean)
	 */
	@Override
	public List<Demo> selectList(Demo demo, PageBean pageBean) {
		return demoMapper.selectList(demo, pageBean);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.jsk.zx.demo.service.IDemoService#getTotalRows(com.jsk.zx.demo.model.Demo)
	 */
	@Override
	public long getTotalRows(Demo demo) {
		return demoMapper.getTotalRows(demo);
	}

}
