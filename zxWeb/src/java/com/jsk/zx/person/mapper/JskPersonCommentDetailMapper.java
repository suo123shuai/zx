package com.jsk.zx.person.mapper;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.person.model.JskPersonCommentDetail;

public interface JskPersonCommentDetailMapper extends IBaseMapper{
   
	/**
	 * @Title: deleteByPrimaryKey
	 * @Description: 删除评论下所有回复
	 * @author: suojinliang
	 * @date: 2018年6月30日 
	 * @param pkId
	 * @return
	 */
    int deleteByPrimaryKey(String commentId);

    /**
     * @Title: deleteByPkId
     * @Description: 删除评论回复
     * @author: suojinliang
     * @date: 2018年7月5日 
     * @param pkId
     * @return
     */
    int deleteByPkId(Integer pkId);
    
    int insert(JskPersonCommentDetail record);

    /**
     * @Title: saveCommentDetail
     * @Description: 插入评论回复
     * @author: suojinliang
     * @date: 2018年6月30日 
     * @param record
     * @return
     */
    int saveCommentDetail(JskPersonCommentDetail record);

    JskPersonCommentDetail selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(JskPersonCommentDetail record);

    int updateByPrimaryKey(JskPersonCommentDetail record);
}