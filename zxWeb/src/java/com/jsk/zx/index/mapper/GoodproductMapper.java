package com.jsk.zx.index.mapper;

import java.util.List;

import com.jsk.zx.index.model.JskIndexGoodproduct;

public interface GoodproductMapper {

	List<JskIndexGoodproduct> selectByStatus(JskIndexGoodproduct goodProduct);
}
