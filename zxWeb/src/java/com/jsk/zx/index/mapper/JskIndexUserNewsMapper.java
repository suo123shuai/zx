package com.jsk.zx.index.mapper;

import java.util.List;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.index.model.JskIndexUserNews;

public interface JskIndexUserNewsMapper extends IBaseMapper{
    int deleteByPrimaryKey(Integer pkId);

    int insert(JskIndexUserNews record);

    int saveSelective(JskIndexUserNews record);

    JskIndexUserNews selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(JskIndexUserNews record);

    int updateByPrimaryKey(JskIndexUserNews record);
    
    /**
     * 查询个人消息
     * @Title: findByNews
     * @Description: 
     * @author: suojinliang
     * @date: 2018年7月30日 
     * @param userId
     * @return
     */
    List<JskIndexUserNews> selectByNewsKey(Integer userId);
}