package com.jsk.zx.system.service;

import com.jsk.zx.system.model.JskSysAnnex;
import com.mltt.core.service.IEntityService;

public interface IAnnexService extends IEntityService<JskSysAnnex>{

	JskSysAnnex findById(Integer pkId);
}
