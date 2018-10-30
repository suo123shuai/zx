package com.jsk.zx.index.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.zx.index.mapper.OpsitionMapper;
import com.jsk.zx.index.model.JskSysUser;
import com.jsk.zx.index.service.IOpsitionService;

@Service
public class OpsitionServiceImpl implements IOpsitionService{
	
	@Autowired
	OpsitionMapper opsitionMapper;
	
	@Override
	public int updateByUserName(JskSysUser jskSysUser) { 
		return opsitionMapper.updateByUserName(jskSysUser);
	}
	
}
