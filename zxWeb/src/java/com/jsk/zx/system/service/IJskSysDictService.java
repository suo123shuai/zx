/**
 * 
 */
package com.jsk.zx.system.service;

import java.util.List;
import java.util.Map;

import com.jsk.zx.system.model.JskSysDict;
import com.mltt.core.service.IEntityService;


/**
 * @Title: IJskSysDictService.java
 * @Description: 字典业务处理类
 * @author: lizp
 * @date: 2018年7月18日 下午5:11:57
 */
public interface IJskSysDictService extends IEntityService<JskSysDict> {

	List<Map<String, String>> findByDictId(String dictId);
}