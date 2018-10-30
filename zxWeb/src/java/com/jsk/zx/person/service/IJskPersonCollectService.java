package com.jsk.zx.person.service;

import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.model.JskPersonCollect;

public interface IJskPersonCollectService {

	/**
	 * @Title: savePersonCollect
	 * @Description: 添加点赞信息
	 * @author: suojinliang
	 * @date: 2018年6月28日 
	 * @param jskPersonCollect 收藏人ID 被收藏ID 类别（1:用户；2:服务；3:产品）
	 * @return
	 * @throws Exception
	 */
	ResultUtil savePersonCollect(JskPersonCollect jskPersonCollect)throws Exception;
	
	/**
	 * @Title: deletePersonCollect
	 * @Description: 取消收藏
	 * @author: suojinliang
	 * @date: 2018年6月28日 
	 * @param id 主键ID
	 * @return
	 * @throws Exception
	 */
	ResultUtil deletePersonCollect(Integer id)throws Exception;
}
