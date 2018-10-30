package com.jsk.zx.pay.service.Impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.zx.login.model.JskSysUser;
import com.jsk.zx.login.mapper.JskSysUserMapper;
import com.jsk.zx.pay.service.IPayUpdateOrderAndUser;
import com.jsk.zx.person.mapper.JskPersonOrderMapper;
import com.jsk.zx.person.model.JskPersonOrder;

@Service
public class PayUpdateOrderAndUserImpl implements IPayUpdateOrderAndUser {

	@Autowired
	private JskPersonOrderMapper orderMapper;
	@Autowired
	private JskSysUserMapper userMapper;
	
	@Override
	public Integer updateOrderById(String orderId, String status) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("orderId", orderId);
		map.put("status", status);
		orderMapper.updateOrderById(map);
		return null;
	}

	@Override
	public JskPersonOrder findPersonOrderByOrderId(String orderId) {
		JskPersonOrder order = orderMapper.findPersonOrderByOrderId(orderId);
		return order;
	}

	@Override
	public int updateUserMarket(Integer userId, Integer integral, Integer integralTotal) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("pkId", userId);
		map.put("integral", integral);
		map.put("integralTotal", integralTotal);
		userMapper.updateUserIntegralNumByKey(map);
		return 0;
	}

	@Override
	public JskSysUser findUserInfoById(Integer pkId) {
		JskSysUser findUserById = userMapper.findUserById(pkId);
		return findUserById;
	}
}
