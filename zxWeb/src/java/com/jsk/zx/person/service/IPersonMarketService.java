package com.jsk.zx.person.service;

import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.model.JskPersonMarket;
import com.mltt.core.service.IEntityService;

public  interface IPersonMarketService extends IEntityService<JskPersonMarket> {
	
	ResultUtil selectPersonMarket() throws Exception;

}
