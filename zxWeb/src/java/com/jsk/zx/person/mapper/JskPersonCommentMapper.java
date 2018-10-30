package com.jsk.zx.person.mapper;

import java.util.List;
import java.util.Map;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.person.model.JskPersonComment;
import com.jsk.zx.person.model.JskPersonCommentorAndDetail;

public interface JskPersonCommentMapper extends IBaseMapper{
	
	/**
	 * @Title: deleteByPrimaryKey
	 * @Description: 删除评论
	 * @author: suojinliang
	 * @date: 2018年6月30日 
	 * @param pkId
	 * @return
	 */
    int deleteByPrimaryKey(Integer pkId);

    int insert(JskPersonComment record);

    /**
     * @Title: saveCommentSelective
     * @Description: 添加评论信息
     * @author: suojinliang
     * @date: 2018年6月25日 
     * @param record
     * @return
     */
    int saveCommentSelective(JskPersonComment record);

    JskPersonComment selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(JskPersonComment record);

    /**
     * 更新优质项目的评论总数
     * @Title: updateByPrimaryKey
     * @Description: 
     * @author: suojinliang
     * @date: 2018年7月22日 
     * @param record
     * @return
     */
    int updateGoodproductByPrimaryKey(Integer pkId);
    
    /**
     * 更新积分商城评论总数
     * @Title: updateMarketByPrimaryKey
     * @Description: 
     * @author: suojinliang
     * @date: 2018年7月22日 
     * @param pkId
     * @return
     */
    int updateMarketByPrimaryKey(Integer pkId);
    
    /**
     * 更新产品评论总数
     * @Title: updateProductByPrimaryKey
     * @Description: 
     * @author: suojinliang
     * @date: 2018年7月22日 
     * @param pkId
     * @return
     */
    int updateProductByPrimaryKey(Integer pkId);
    
    /**
     * 更新评论总数
     * @Title: updateServiceByPrimaryKey
     * @Description: 
     * @author: suojinliang
     * @date: 2018年7月22日 
     * @param pkId
     * @return
     */
    int updateServiceByPrimaryKey(Integer pkId);
    
    /**
     * 
     * @return
     * @throws Exception
     */
    List<JskPersonCommentorAndDetail> findByRecordId(Map map);
}