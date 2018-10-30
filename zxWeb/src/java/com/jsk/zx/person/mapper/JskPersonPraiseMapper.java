package com.jsk.zx.person.mapper;


import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.person.model.JskPersonPraise;

public interface JskPersonPraiseMapper extends IBaseMapper{

	/**
	 * insertPersonPraise方法，       添加一条点赞数据并返回记录ID
	 * @param record
	 * @return
	 */
    int insertPersonPraise(JskPersonPraise record);
    
    /**
     * selectByIdsAndType方法，     根据userId,recordId,type查询点赞表是否已有此数据
     * @param record
     * @return
     */
    JskPersonPraise selectByIdsAndType(JskPersonPraise record);
    
    /**
     * updateUserPraiseNum方法，     更新用戶表中的点赞数
     * @param 
     * @return
     */
    int updateUserPraiseNum(int recordId);
    
    /**
     * updateProductPraiseNum方法，     更新改产品表中的点赞数
     * @param 
     * @return
     */
    int updateProductPraiseNum(int recordId);

    /**
     * updateServicePraiseNum方法，     更新服务品表中的点赞数
     * @param 
     * @return
     */
    int updateServicePraiseNum(int recordId);
    
    /**
     * updateMarketPraiseNum方法，     更新服积分商城表中的点赞数
     * @param 
     * @return
     */
    int updateMarketPraiseNum(int recordId);
}