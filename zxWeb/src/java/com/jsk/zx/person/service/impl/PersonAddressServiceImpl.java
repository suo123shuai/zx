package com.jsk.zx.person.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.jsk.base.service.BaseService;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.mapper.JskPersonAddressMapper;
import com.jsk.zx.person.model.JskPersonAddress;
import com.jsk.zx.person.service.IPersonAddressService;


@Service("personAddressServiceImpl")
public class PersonAddressServiceImpl extends BaseService implements IPersonAddressService{

	@Autowired
	private JskPersonAddressMapper addressMapper;
		
	@Override
	public ResultUtil findPersonAddressById(int pkId) throws Exception {
		ResultUtil retu = new ResultUtil();
		List<JskPersonAddress> list = addressMapper.findPersonAddressById(pkId);
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("查询地址详情失败");
		}
		return retu;
	}
	
	
	
	@Override
	public ResultUtil createOrUpdatePersonAddress(JskPersonAddress jskPersonAddress) throws Exception {
		ResultUtil retu = new ResultUtil();
		Integer addressId=jskPersonAddress.getPkId();
		Integer userId=jskPersonAddress.getUserId();
		String isDefault=jskPersonAddress.getIsDefault();
		if(addressId !=null){
			try {
				jskPersonAddress.setUpdateTime(new Date());
				if(isDefault.equals("0")){
					int i=addressMapper.updatePersonAddress(jskPersonAddress);
					if (i == 0) {
						retu.setId(3);
						retu.setMsg("修改地址失败");
					} else {
						retu.setId(2);
						retu.setMsg("修改地址成功");
					}
				}else{
					Integer pkId=addressMapper.selectId(userId);
					addressMapper.updateisDefault(pkId);
					int i=addressMapper.updatePersonAddress(jskPersonAddress);
					if (i == 0) {
						retu.setId(3);
						retu.setMsg("修改地址失败");
					} else {
						retu.setId(2);
						retu.setMsg("修改地址成功");
					}
				}
				
			} catch (Exception e) {

				e.printStackTrace();
			}
			
		}else{
			if(isDefault.equals("0")){
				jskPersonAddress.setCreateTime(new Date());
				int j=addressMapper.createPersonAddress(jskPersonAddress);
				if(j==0){
					retu.setId(1);
					retu.setMsg("新增地址失败");
				}else{
					List<Integer> list = new ArrayList<Integer>();
					list.add(jskPersonAddress.getPkId());
					retu.setId(0);
					retu.setMsg("新增地址成功");
					retu.setData(list);
				}
			}else{
				jskPersonAddress.setCreateTime(new Date());
				Integer pkId=addressMapper.selectId(userId);
				addressMapper.updateisDefault(pkId);
				int j=addressMapper.createPersonAddress(jskPersonAddress);
				if(j==0){
					retu.setId(1);
					retu.setMsg("新增地址失败");
				}else{
					List<Integer> list = new ArrayList<Integer>();
					list.add(jskPersonAddress.getPkId());
					retu.setId(0);
					retu.setMsg("新增地址成功");
					retu.setData(list);
				}
			}
			
		}
		
		return retu;
	}
	





	@Override
	public ResultUtil deletePersonAddressById(int pkId) throws Exception {
		ResultUtil retu = new ResultUtil();
		try {
			int i=addressMapper.deletePersonAddressById(pkId);
			if (i == 0) {
				retu.setId(1);
				retu.setMsg("删除地址失败");
			} else {
				retu.setId(0);
				retu.setMsg("删除地址成功");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		return retu;
	}
	
	@Override
	public ResultUtil selectByUserKey(Integer userId) {
		ResultUtil retu = new ResultUtil();
		if (!StringUtils.isEmpty(userId)) {
			List<JskPersonAddress> list = addressMapper.selectByUserKey(userId);
			if(!StringUtils.isEmpty(list) && list.size() != 0){
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("ok");
				return retu;
			}
			retu.setId(1);
			retu.setMsg("未设置地址");
			return retu;
		}
		retu.setId(2);
		retu.setMsg("数据为空");
		return retu;
	}
}
