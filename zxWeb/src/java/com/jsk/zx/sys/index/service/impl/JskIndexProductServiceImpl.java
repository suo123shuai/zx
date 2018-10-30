package com.jsk.zx.sys.index.service.impl;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jsk.base.common.Constant;
import com.jsk.base.common.UserSession;
import com.jsk.base.util.FileUtil;
import com.jsk.zx.sys.index.mapper.IJskIndexProductMapper;
import com.jsk.zx.sys.index.model.JskSysIndexProduct;
import com.jsk.zx.sys.index.service.IJskIndexProductService;
import com.jsk.zx.sys.mapper.IJskSysAnnexMapper;
import com.jsk.zx.sys.model.JskSysAnnex;
import com.mltt.core.service.BaseEntityService;


/**
 * @title:JskIndexProductServiceImpl.java
 * @Description:商品管理
 * @author: liuyan
 * @date:2018年7月31日
 */
@Service("JskIndexProductServiceImpl")
public class JskIndexProductServiceImpl extends BaseEntityService<JskSysIndexProduct, IJskIndexProductMapper> implements IJskIndexProductService{
     
	@Autowired
	private HttpServletRequest request;

	@Autowired
	private IJskSysAnnexMapper jskSysAnnexMapper;

	@Override
	@Transactional
	public int save(JskSysIndexProduct record) {
		int result = 0;
		UserSession us = (UserSession) request.getSession().getAttribute(Constant.USER_SESSION);
		if (record.getPkId() == null) {
			record.setCreateId(us.getUser().getPkId());
			result = mapper.insert(record);
		} else {
			record.setUpdateTime(new Date());
			record.setUpdateId(us.getUser().getPkId());
			result = mapper.update(record);
		}
		int count = 0;
		count = result / count;
		// 如果有附件则处理附件
		JskSysAnnex jskSysAnnex = FileUtil.upload(FileUtil.getPath(FileUtil.FILE_PATH_SUFFIX_INDEX),
				record.getFile());
		if (jskSysAnnex != null) {
			jskSysAnnex.setCreateId(us.getUser().getPkId());
			jskSysAnnex.setRecordId(record.getPkId());
			jskSysAnnex.setTableName(record.getTableName());
			jskSysAnnex.setRecordField("photo");
			JskSysAnnex tmp = jskSysAnnexMapper.find(jskSysAnnex);
			if(tmp != null) {
				// 删除以前的附件
				FileUtil.delete(FileUtil.getPath(FileUtil.FILE_PATH_SUFFIX_INDEX) + tmp.getFileName()
					+ tmp.getFileSuffix());
				jskSysAnnexMapper.deleteById(tmp.getPkId());
			}
			// 保存新的附件
			jskSysAnnexMapper.insert(jskSysAnnex);
			record.setPhoto(jskSysAnnex.getPkId());
			mapper.update(record);
		}
		return result;
	}
}
