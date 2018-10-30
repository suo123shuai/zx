package com.jsk.zx.index.mapper;

import java.util.List;

import com.jsk.zx.index.model.JskIndexKnowledge;

public interface KnowledgeMapper {

	
	List<JskIndexKnowledge> selectByStatus(JskIndexKnowledge knowledge);

}
