package com.jsk.zx.person.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.person.model.JskPersonCollect;
import com.jsk.zx.person.model.JskPersonCollectExample;

public interface JskPersonCollectMapper extends IBaseMapper{
    long countByExample(JskPersonCollectExample example);

    int deleteByExample(JskPersonCollectExample example);

    /**
     * @Title: deleteByPrimaryKey
     * @Description: 根据ID取消收藏
     * @author: suojinliang
     * @date: 2018年6月28日 
     * @param pkId
     * @return
     */
    int deleteByPrimaryKey(Integer pkId);

    int insert(JskPersonCollect record);

    /**
     * @Title: insertSelective
     * @Description:  根据用户ID 产品ID 产品种类添加收藏
     * @author: suojinliang
     * @date: 2018年6月28日 
     * @param record
     * @return
     */
    int saveSelective(JskPersonCollect record);

    List<JskPersonCollect> selectByExample(JskPersonCollectExample example);

    /**
     * @Title: selectByPrimaryKey
     * @Description: 根据用户ID 产品ID 产品种类 查询是否重复收藏
     * @author: suojinliang
     * @date: 2018年6月28日 
     * @param record
     * @return
     */
    JskPersonCollect selectByPrimaryCollect(JskPersonCollect record);

    int updateByExampleSelective(@Param("record") JskPersonCollect record, @Param("example") JskPersonCollectExample example);

    int updateByExample(@Param("record") JskPersonCollect record, @Param("example") JskPersonCollectExample example);

    int updateByPrimaryKeySelective(JskPersonCollect record);

    int updateByPrimaryKey(JskPersonCollect record);
}