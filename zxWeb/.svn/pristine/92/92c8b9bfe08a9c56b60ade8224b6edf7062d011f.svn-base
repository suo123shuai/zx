package com.jsk.zx.business.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.common.PageBean;
import com.jsk.base.service.BaseService;
import com.jsk.zx.business.mapper.LeagueMapper;
import com.jsk.zx.business.model.JskIndexService;
import com.jsk.zx.business.service.ILeagueService;

/**
 * @Title: LeagueServiceImpl.java
 * @Description: 例子
 * @author: lizp
 * @date: 2018-6-7 下午9:44:47
 */
@Service("leagueServiceImpl")
public class LeagueServiceImpl extends BaseService implements ILeagueService {

	@Autowired
	private LeagueMapper leagueMapper;
	@Override
	public long getTotalRows(JskIndexService service) {
		return leagueMapper.getTotalRows(service);
	}

	@Override
	public List<JskIndexService> selectList(JskIndexService service, PageBean pageBean) {
		return leagueMapper.selectList(service, pageBean);
	}

}
