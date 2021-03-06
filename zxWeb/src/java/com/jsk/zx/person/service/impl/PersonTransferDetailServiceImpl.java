package com.jsk.zx.person.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.login.mapper.JskSysUserMapper;
import com.jsk.zx.login.model.JskSysUser;
import com.jsk.zx.person.common.Arith;
import com.jsk.zx.person.mapper.JskPersonTrancsferDetailMapper;
import com.jsk.zx.person.model.JskPersonTransferDetail;
import com.jsk.zx.person.model.ResuUtil;
import com.jsk.zx.person.service.IPersonTransferDetailService;

@Service
public class PersonTransferDetailServiceImpl implements
		IPersonTransferDetailService {

	@Autowired
	private JskPersonTrancsferDetailMapper trancsferDetailMapper;
	@Autowired
	private JskSysUserMapper userMapper;

	@Override
	/**
	 * selectPersonTrancsferDetail方法，    查询提现明细
	 */
	public ResultUtil selectPersonTrancsferDetail(int userId) {
		ResultUtil resu = new ResultUtil();
		List<JskPersonTransferDetail> list = trancsferDetailMapper
				.selectPersonTrancsferDetail(userId);
		if (list != null && !list.isEmpty()) {
			resu.setId(0);
			resu.setData(list);
			resu.setMsg("成功");
		} else {
			resu.setId(1);
			resu.setData(list);
			resu.setMsg("没有交易");
		}
		return resu;
	}

	@Override
	/**
	 * selectPersonTrancsferDetail方法，    查询提现明细
	 */
	public ResultUtil selectPersonTrancsferDetailByType() {
		ResultUtil resu = new ResultUtil();
		List<JskPersonTransferDetail> list = trancsferDetailMapper
				.selectPersonTrancsferDetailByType();
		if (list != null && !list.isEmpty()) {
			resu.setId(0);
			resu.setData(list);
			resu.setMsg("成功");
		} else {
			resu.setId(1);
			resu.setData(list);
			resu.setMsg("没有交易");
		}
		return resu;
	}

	@Override
	public ResultUtil savsePersonTrancsferDetail(Integer userId, Float balance,
			String transferName) {
		ResultUtil resu = new ResultUtil();
		Map<String, Object> map = new HashMap<String, Object>();
		if (!StringUtils.isEmpty(userId) && !StringUtils.isEmpty(balance)
				&& !StringUtils.isEmpty(transferName)) {
			JskSysUser user = userMapper.findUserById(userId);
			float balances = (float) Arith.round(
					Arith.sub(user.getBalance(), balance), 2);
			if (balances >= 0) {
				JskPersonTransferDetail transfer = new JskPersonTransferDetail();
				String dd = new SimpleDateFormat("yyMMddHHmmss")
						.format(new Date());
				int i = (int) ((Math.random() * 9 + 1) * 100000);
				transfer.setOrderId(dd + i);
				transfer.setTransferName(transferName);
				transfer.setUserId(userId);
				transfer.setCreateTime(new Date());
				transfer.setMoney(balance);
				trancsferDetailMapper.savsePersonTrancsferDetail(transfer);
				map.put("pkId", user.getPkId());
				map.put("balance", -balance);
				userMapper.updateUserBalance(map);
				resu.setId(0);
				resu.setMsg("提交成功");
				return resu;
			}
			resu.setId(1);
			resu.setMsg("余额不足");
			return resu;
		}
		resu.setId(2);
		resu.setMsg("数据不可为空");
		return resu;
	}

	@Override
	public JskPersonTransferDetail findByTrancsferDetail(Integer pkId) {
		JskPersonTransferDetail transferDetail = trancsferDetailMapper
				.findByTrancsferDetail(pkId);
		return transferDetail;
	}

	@Override
	public ResuUtil updatePersonTrancsferDetailByType(Integer userId,
			String type) {
		Map<String, Object> map = new HashMap<String, Object>();
		ResuUtil resu = new ResuUtil();
		map.put("userId", userId);
		map.put("type", type);
		int i = 0;
		try {
			i = trancsferDetailMapper.updateTrancsferDetailType(map);
			if (!(i == 0)) {
				resu.setStatus(0);
				resu.setMsg("ok");
				return resu;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		resu.setStatus(1);
		resu.setMsg("更新失败");
		return resu;
	}
}
