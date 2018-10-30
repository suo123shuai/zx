package com.jsk.zx.person.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jsk.base.service.BaseService;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.mapper.JskPersonCollectMapper;
import com.jsk.zx.person.model.JskPersonCollect;
import com.jsk.zx.person.service.IJskPersonCollectService;

@Service
public class JskPersonCollectServiceImpl extends BaseService implements IJskPersonCollectService {

	@Autowired
	private JskPersonCollectMapper jskPersonCollectMapper;

	@Override
	public ResultUtil savePersonCollect(JskPersonCollect jskPersonCollect)
			throws Exception {
		ResultUtil resu = new ResultUtil();
		if (StringUtils.isEmpty(jskPersonCollect.getRecordId())
				|| StringUtils.isEmpty(jskPersonCollect.getUserId())
				|| StringUtils.isEmpty(jskPersonCollect.getType())) {
			resu.setId(1);
			resu.setMsg("数据为空");
			return resu;
		}
		JskPersonCollect collect = jskPersonCollectMapper
				.selectByPrimaryCollect(jskPersonCollect);

		if (StringUtils.isEmpty(collect)) {
			jskPersonCollect.setCreateTime(new Date());
			int i = jskPersonCollectMapper.saveSelective(jskPersonCollect);
			if(i == 1){
				resu.setId(0);
				resu.setMsg("已收藏");
				
			}else{
				resu.setId(2);
				resu.setMsg("收藏失败");
			}
			return resu;
		}
		resu.setId(3);
		resu.setMsg("已收藏过此产品");
		return resu;
	}

	@Override
	public ResultUtil deletePersonCollect(Integer id){
		ResultUtil resu = new ResultUtil();
		if(StringUtils.isEmpty(id)){
			resu.setId(1);
			resu.setMsg("id为空");
			return resu;
		}
		int i;
		try {
			i = jskPersonCollectMapper.deleteByPrimaryKey(id);
			if(i == 1){
				resu.setId(0);
				resu.setMsg("已取消收藏");
				return resu;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		resu.setId(2);
		resu.setMsg("取消收藏失败");
		return resu;
	}
}
