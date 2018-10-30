/**
 * 
 */
package com.jsk.zx.sys.index.service.impl;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.common.Constant;
import com.jsk.base.common.UserSession;
import com.jsk.base.util.FileUtil;
import com.jsk.zx.index.model.JskIndexRecommend;
import com.jsk.zx.sys.index.mapper.IJskIndexProductMapper;
import com.jsk.zx.sys.index.mapper.IJskIndexRecommendMapper;
import com.jsk.zx.sys.index.model.JskSysIndexProduct;
import com.jsk.zx.sys.index.service.IJskIndexRecommendService;
import com.jsk.zx.sys.mapper.IJskSysAnnexMapper;
import com.jsk.zx.sys.model.JskSysAnnex;
import com.mltt.core.entity.Page;
import com.mltt.core.service.BaseEntityService;

/**
 * @Title: JskIndexRecommendServiceImpl.java
 * @Description: TODO 
 * @author: lizp
 * @date: 2018年7月30日 下午5:33:44
 */
@Service("JskIndexRecommendServiceImpl")
public class JskIndexRecommendServiceImpl extends BaseEntityService<JskIndexRecommend, IJskIndexRecommendMapper> implements IJskIndexRecommendService {

	@Autowired
	private HttpServletRequest request;

	@Autowired
	private IJskSysAnnexMapper jskSysAnnexMapper;
	
	@Autowired
	private IJskIndexProductMapper jskIndexProductMapper;
	
	public int save(JskIndexRecommend jskIndexRecommend) {
		UserSession us = (UserSession) request.getSession().getAttribute(Constant.USER_SESSION);
		int result = 0;
		if (jskIndexRecommend.getPkId() == null) {
			jskIndexRecommend.setCreateId(us.getUser().getPkId());
			result = mapper.insert(jskIndexRecommend);
		} else {
			jskIndexRecommend.setUpdateTime(new Date());
			jskIndexRecommend.setUpdateId(us.getUser().getPkId());
			result = mapper.update(jskIndexRecommend);
		}
		// 如果有附件则处理附件
		try {
			JskSysAnnex jskSysAnnex = FileUtil.upload(FileUtil.getPath(FileUtil.FILE_PATH_SUFFIX_INDEX),
					jskIndexRecommend.getFile());
			if (jskSysAnnex != null) {
				jskSysAnnex.setCreateId(us.getUser().getPkId());
				jskSysAnnex.setRecordId(jskIndexRecommend.getPkId());
				jskSysAnnex.setTableName(jskIndexRecommend.getTableName());
				jskSysAnnex.setRecordField("photo");
				JskSysAnnex tmp = jskSysAnnexMapper.find(jskSysAnnex);
				if(tmp != null) {
					// 删除以前的附件
					FileUtil.delete(FileUtil.getPath(FileUtil.FILE_PATH_SUFFIX_INDEX) + jskSysAnnex.getFileName()
							+ jskSysAnnex.getFileSuffix());
					jskSysAnnexMapper.deleteById(tmp.getPkId());
				}
				// 保存新的附件
				jskSysAnnexMapper.insert(jskSysAnnex);
			}
		} catch (Exception e) {
			logger.error("上传附件异常，异常信息：" + e);
		}
		return result;
	}

	@Override
	public int recommend(Integer pkId) {
		return mapper.recommend(pkId);
	}

	@Override
	public int unrecommend(Integer pkId) {
		return mapper.unrecommend(pkId);
	}

}
