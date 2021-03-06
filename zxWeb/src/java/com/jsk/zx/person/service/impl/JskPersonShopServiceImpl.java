package com.jsk.zx.person.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.jsk.base.service.BaseService;
import com.jsk.zx.person.mapper.JskIndexProductMapper;
import com.jsk.zx.person.mapper.JskIndexServiceMapper;
import com.jsk.zx.person.mapper.JskPersonMarketMapper;
import com.jsk.zx.person.mapper.JskPersonShopMapper;
import com.jsk.zx.person.model.JskIndexProduct;
import com.jsk.zx.person.model.JskIndexService;
import com.jsk.zx.person.model.JskPersonMarket;
import com.jsk.zx.person.model.JskPersonShop;
import com.jsk.zx.person.model.ResuUtil;
import com.jsk.zx.person.service.IJskPersonShopService;

/**
 * 
 * @Title: JskPersonShopServiceImpl.java
 * @Description: 购物车
 * @author: suojinliang
 * @date: 2018年6月25日 上午9:33:47
 */

@Service
public class JskPersonShopServiceImpl extends BaseService implements IJskPersonShopService {

	@Autowired
	private JskPersonShopMapper jskPersonShopMapper;
	@Autowired
	private JskIndexServiceMapper serviceMapper;
	@Autowired
	private JskIndexProductMapper productMapper;
	@Autowired
	private JskPersonMarketMapper marketMapper;

	@Override
	public ResuUtil saveJskPersonShop(JskPersonShop jskPersonShop)
			throws Exception {
		ResuUtil resu = new ResuUtil();
		JskPersonShop jskPersonShop2 = jskPersonShopMapper
				.findByUserIdAndRecordId(jskPersonShop);
		if (StringUtils.isEmpty(jskPersonShop2)) {
			if ("1".equals(jskPersonShop.getType())) {
				JskIndexService record = serviceMapper
						.selectByPrimaryKey(jskPersonShop.getRecordId());
				jskPersonShop.setRecordName(record.getTitle());
				jskPersonShop.setRecordPrice(record.getPrice());
			}
			if ("2".equals(jskPersonShop.getType())) {
				JskIndexProduct record = productMapper
						.selectByPrimaryKey(jskPersonShop.getRecordId());
				jskPersonShop.setRecordName(record.getTitle());
				jskPersonShop.setRecordPrice(record.getPrice());
			}
			if ("3".equals(jskPersonShop.getType())) {
				JskPersonMarket record = marketMapper
						.selectMarketByPrimaryKey(jskPersonShop.getRecordId());
				jskPersonShop.setRecordName(record.getTitle());
				jskPersonShop.setRecordPrice(record.getPrice());
			}
			jskPersonShop.setCreateTime(new Date());

			int i = jskPersonShopMapper.saveJskPersonSho(jskPersonShop);
			if (i != 1) {
				resu.setStatus(1);
				resu.setMsg("添加购物车失败");
			} else {
				resu.setStatus(0);
				resu.setMsg("添加购物车成功");
				resu.setData(jskPersonShop);
			}
			return resu;
		} else {
			jskPersonShop2.setPayNum(jskPersonShop.getPayNum()
					+ jskPersonShop2.getPayNum());
			jskPersonShop2.setCreateTime(new Date());
			int i = jskPersonShopMapper.updateJskPersonSho(jskPersonShop2);
			if (i != 1) {
				resu.setStatus(2);
				resu.setMsg("添加购物车失败");
			} else {
				resu.setStatus(0);
				resu.setMsg("添加购物车成功");
				resu.setData(jskPersonShop2);
			}
			return resu;
		}
	}

	@Override
	public ResuUtil findByUserId(Integer id, String type) throws Exception {
		ResuUtil resu = new ResuUtil();
		Map<String, Object> map = new HashMap<String, Object>();
		if (StringUtils.isEmpty(id) || StringUtils.isEmpty(type)) {
			resu.setStatus(1);
			resu.setMsg("数据未传入");
			return resu;
		}
		map.put("userId", id);
		map.put("type", type);
		List<JskPersonShop> serviceList = jskPersonShopMapper
				.findServiceByUserId(map);
		if (null == serviceList || serviceList.isEmpty()) {
			resu.setStatus(2);
			resu.setMsg("购物车没有物品");
			return resu;
		}
		resu.setStatus(0);
		resu.setMsg("ok");
		resu.setData(serviceList);
		return resu;
	}

	@Override
	public ResuUtil deleteByShopId(String shopIds) throws Exception {
		ResuUtil resu = new ResuUtil();
		if (StringUtils.isEmpty(shopIds)) {
			resu.setStatus(1);
			resu.setMsg("id为空");
			return resu;
		} else {
			String[] shopId = shopIds.split(",");
			int i = jskPersonShopMapper.deleteByShopId(shopId);
			if (i > 0) {
				resu.setStatus(0);
				resu.setMsg("删除成功");
				return resu;
			}

		}
		resu.setStatus(2);
		resu.setMsg("删除失败");
		return resu;
	}

	@Override
	public ResuUtil deleteByUserId(Integer userId) throws Exception {
		ResuUtil resu = new ResuUtil();
		if (!StringUtils.isEmpty(userId)) {
			int i = jskPersonShopMapper.deleteByUserId(userId);
			if (i > 0) {
				resu.setStatus(0);
				resu.setMsg("删除成功");
				return resu;
			}
		} else {
			resu.setStatus(1);
			resu.setMsg("id为空");
			return resu;
		}
		resu.setStatus(2);
		resu.setMsg("删除失败");
		return resu;
	}

	@Override
	public ResuUtil updateShop(JskPersonShop jskPersonShop) {
		ResuUtil resu = new ResuUtil();
		jskPersonShop.setCreateTime(new Date());
		int i = jskPersonShopMapper.updateJskPersonSho(jskPersonShop);
		if (i == 1) {
			resu.setStatus(0);
			resu.setMsg("ok");
			return resu;
		}
		resu.setStatus(2);
		resu.setMsg("更改失败");
		return resu;
	}

}
