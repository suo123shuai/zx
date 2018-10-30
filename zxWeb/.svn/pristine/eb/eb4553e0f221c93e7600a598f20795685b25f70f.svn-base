package com.jsk.zx.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.zx.system.mapper.IAnnexMapper;
import com.jsk.zx.system.model.JskSysAnnex;
import com.jsk.zx.system.service.IAnnexService;
import com.mltt.core.service.BaseEntityService;

@Service
public class AnnexServiceImpl extends
		BaseEntityService<JskSysAnnex, IAnnexMapper> implements IAnnexService {
	
	@Autowired
	private IAnnexMapper annexMapper;

	@Override
	public JskSysAnnex findById(Integer pkId) {
		JskSysAnnex annex = annexMapper.findById(pkId);
		return annex;
	}
	
}
