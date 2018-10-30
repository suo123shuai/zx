package com.jsk.zx.person.mapper;

import java.util.List;

import com.jsk.base.mapper.IBaseMapper;
import com.jsk.zx.person.model.JskPersonAddress;

public interface JskPersonAddressMapper extends IBaseMapper{

    int insert(JskPersonAddress record);

    /**
     * @Title: insertSelective
     * @Description: 添加用户地址
     * @author: suojinliang
     * @date: 2018年7月10日 
     * @param record
     * @return
     */
    int insertSelective(JskPersonAddress record);


    /**
     * @Title: selectByPrimaryKey
     * @Description: 根据用户ID查询地址
     * @author: suojinliang
     * @date: 2018年7月10日 
     * @param pkId
     * @return
     */
    List<JskPersonAddress> selectByUserKey(Integer userId);


    int updateByPrimaryKeySelective(JskPersonAddress record);

    int updateByPrimaryKey(JskPersonAddress record);
    
    /**
     * @Title: findPersonAddressById
     * @Description: 根据订单ID查询订单详情
     * @author: liuyan
     * @date: 2018年7月18日 
     * @param pkId
     * @return
     */
    
    List<JskPersonAddress> findPersonAddressById(int pkId);
    
    
    /**
     * @Title: updatePersonddress
     * @Description: 修改地址
     * @author: liuyan
     * @date: 2018年7月19日 
     * @param jskPersonAddress
     * @return
     */
    
   int  updatePersonAddress(JskPersonAddress jskPersonAddress);
   
   /**
    * @Title: updateisDefault
    * @Description: 修改地址
    * @author: liuyan
    * @date: 2018年8月3日 
    * @param 
    * @return
    */
   
  int  updateisDefault(Integer pkId);
  
  
  Integer selectId(Integer userId);
   
   /**
    * @Title: createPersonddress
    * @Description: 新建地址
    * @author: liuyan
    * @date: 2018年7月19日 
    * @param jskPersonAddress
    * @return
    */
   
   int  createPersonAddress(JskPersonAddress jskPersonAddress);
   
   /**
    * @Title: deletePersonAddress
    * @Description: 删除地址
    * @author: liuyan
    * @date: 2018年7月19日 
    * @param pkId
    * @return
    */
   int deletePersonAddressById(int pkId);
    
}