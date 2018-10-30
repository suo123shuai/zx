/**
 * 
 */
package com.jsk.zx.system.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.jsk.zx.system.mapper.IJskSysDictMapper;
import com.jsk.zx.system.model.JskSysDict;
import com.jsk.zx.system.service.IJskSysDictService;
import com.mltt.core.service.BaseEntityService;

/**
 * @Title: JskSysDictServiceImpl.java
 * @Description: 字典管理
 * @author: lizp
 * @date: 2018年7月24日 上午12:19:07
 */
@Service
public class JskSysDictServiceImpl extends BaseEntityService<JskSysDict, IJskSysDictMapper> implements IJskSysDictService {

	@Override
	public List<Map<String, String>> findByDictId(String dictId) {
		return mapper.findByDictId(dictId);
	}

}
