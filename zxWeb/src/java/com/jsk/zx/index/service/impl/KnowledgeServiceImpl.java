package com.jsk.zx.index.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.zx.index.mapper.KnowledgeMapper;
import com.jsk.zx.index.model.JskIndexKnowledge;
import com.jsk.zx.index.service.IKnowledgeService;
import com.jsk.zx.login.common.ResultUtil;

@Service
public class KnowledgeServiceImpl implements IKnowledgeService {

	@Autowired
	KnowledgeMapper knowledgeMapper;
	
	@Override
	public ResultUtil selectByStatus(JskIndexKnowledge knowledge)
			throws Exception {
		ResultUtil retu = new ResultUtil();
		List<JskIndexKnowledge> result = knowledgeMapper.selectByStatus(knowledge);
		if(result.size() == 0 || !"1".equals(knowledge.getStatus())){
			retu.setId(1);
			retu.setMsg("装修小常识还未发布");/*查询结果为空时，返回错误信息*/
		}else{
			retu.setId(0);
			retu.setData(result);
		}
		return retu;
	}

}
