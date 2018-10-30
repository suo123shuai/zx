package com.jsk.zx.person.mapper;

import java.util.List;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.person.model.JskPersonOrderDetail;

public interface JskPersonOrderDetailMapper extends IBaseMapper{

    int deleteByPrimaryKey(Integer pkId);

    /**
     * 插入订单详细
     * @Title: saveOrderDetailSelective
     * @Description: 
     * @author: suojinliang
     * @date: 2018年7月18日 
     * @param record
     * @return
     */
    int saveOrderDetailSelective(JskPersonOrderDetail record);

    JskPersonOrderDetail selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(JskPersonOrderDetail record);

    int updateByPrimaryKey(JskPersonOrderDetail record);
    /**
     * 订单详情页面的工种查询
     * @Title: findWorkTypeByRecordId
     * @Description: 
     * @author: liuyan
     * @date: 2018年7月26日 
     * @param recordId
     * @return
     */
    List<JskPersonOrderDetail> findWorkTypeByRecordId(int recordId);
    
    /**
     * 订单详情页面服务信息查询
     * @Title: findWorkTypeByRecordId
     * @Description: 
     * @author: liuyan
     * @date: 2018年7月26日 
     * @param recordId
     * @return
     */
    List<JskPersonOrderDetail> findServiceOrderDetailByRecordId(int recordId);
}