package com.jsk.zx.person.mapper;

import java.util.List;
import java.util.Map;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.person.model.JskPersonTransferDetail;

public interface JskPersonTrancsferDetailMapper extends IBaseMapper{
	
	List<JskPersonTransferDetail> selectPersonTrancsferDetail(int userId);
	
	List<JskPersonTransferDetail> selectPersonTrancsferDetailByType();
    
	
	/**
	 * 添加转账明细
	 * @Title: savsePersonTrancsferDetail
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月25日 
	 * @param transfer
	 * @return
	 */
	int savsePersonTrancsferDetail(JskPersonTransferDetail transfer);
	
	/**
	 * 查询订单明细
	 * @Title: findByTrancsferDetail
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月26日 
	 * @param pkId
	 * @return
	 */
	JskPersonTransferDetail findByTrancsferDetail(Integer pkId);
	
	/**
	 * 更新订单状态
	 * @Title: updateTrancsferDetailType
	 * @Description: 
	 * @author: suojinliang
	 * @date: 2018年7月27日 
	 * @param map
	 * @return
	 */
	int updateTrancsferDetailType(Map<String, Object> map);
}
