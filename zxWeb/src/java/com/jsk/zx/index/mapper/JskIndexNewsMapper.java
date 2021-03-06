package com.jsk.zx.index.mapper;

import java.util.List;
import java.util.Map;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.index.model.JskIndexNews;
/**
 * 
 * @author suojinliang
 * @date 2018年6月14日
 */
public interface JskIndexNewsMapper extends IBaseMapper{
    int deleteByPrimaryKey(Integer pkId);

    int insert(JskIndexNews record);

    /**
     * 插入新的消息
     * @Title: insertSelective
     * @Description: 
     * @author: suojinliang
     * @date: 2018年7月30日 
     * @param record
     * @return
     */
    int insertSelective(JskIndexNews record);

    JskIndexNews selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(JskIndexNews record);

    int updateByPrimaryKey(JskIndexNews record);
    
    /**
     * 
     * @Description:根据消息类型查询消息
     * @param type
     * @return
     * 2018年6月14日
     */
    List<JskIndexNews> findByType();
    
    /**
     * 根据用户名字查询消息
     * @Title: findByUserType
     * @Description: 
     * @author: suojinliang
     * @date: 2018年7月30日 
     * @param type
     * @return
     */
    List<JskIndexNews> findByUserType(Map<String, Object> map);
}