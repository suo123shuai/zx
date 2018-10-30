package com.jsk.zx.system.mapper;

import com.jsk.zx.system.model.JskSysAnnex;
import com.mltt.core.mapper.IBaseEntityMapper;

public interface IAnnexMapper extends IBaseEntityMapper<JskSysAnnex>{

	/**
	 * 查询图片地址
	 * @Title: findById
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年8月11日 
	 * @param pkId
	 * @return
	 */
	JskSysAnnex findById(Integer pkId);
}
