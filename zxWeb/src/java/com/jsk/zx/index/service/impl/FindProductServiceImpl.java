/**
 * 
 */

package com.jsk.zx.index.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsk.base.service.BaseService;
import com.jsk.zx.index.mapper.FindProductMapper;
import com.jsk.zx.index.model.JskIndexFindProduct;
import com.jsk.zx.index.service.IFindProductService;
import com.jsk.zx.login.common.ResultUtil;
import com.jsk.zx.person.model.JskPersonOrder;

@Service("findProductServiceImpl")
public class FindProductServiceImpl extends BaseService implements
		IFindProductService {

	@Autowired
	private FindProductMapper findProductMapper;

	@Override
	public ResultUtil selectProductByType(String type) throws Exception {
		ResultUtil retu = new ResultUtil();
		if (type != null && !"".equals(type)) {
			if (type.equals("0")) {// 查询所有的产品
				List<JskIndexFindProduct> list = findProductMapper
						.selectProducts();
				if (list != null && !list.isEmpty()) {
					retu.setId(0);
					retu.setData(list);
					retu.setMsg("成功");
				} else {
					retu.setId(1);
					retu.setData(list);
					retu.setMsg("没有合适的产品");
				}
			} else {
				List<JskIndexFindProduct> list = findProductMapper
						.selectProductByType(type);// 按类别查询
				if (list != null && !list.isEmpty()) {
					retu.setId(0);
					retu.setData(list);
					retu.setMsg("成功");
				} else {
					retu.setId(1);
					retu.setData(list);
					retu.setMsg("没有合适的产品");
				}
			}
		}

		return retu;
	}
    //找产品详情
	@Override
	public ResultUtil selectProductById(int pkId) throws Exception {
		ResultUtil retu = new ResultUtil();

		List<JskIndexFindProduct> list = findProductMapper
				.selectProductById(pkId);
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有合适的产品");
		}
		return retu;
	}
	//查询推荐商品
	@Override
	public ResultUtil findRecommendProduct() throws Exception {
		ResultUtil retu = new ResultUtil();

		List<JskIndexFindProduct> list = findProductMapper
				.findRecommendProduct();
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有合适的产品");
		}
		return retu;
	}
	
	 //我的动态  店铺用户的商品信息
		@Override
		public ResultUtil findMyProduct(int userId) throws Exception {
			ResultUtil retu = new ResultUtil();
			List<JskIndexFindProduct> list = findProductMapper
					.findMyProduct(userId);
			if (list != null && !list.isEmpty()) {
				retu.setId(0);
				retu.setData(list);
				retu.setMsg("成功");
			} else {
				retu.setId(1);
				retu.setData(list);
				retu.setMsg("没有合适的产品");
			}
			return retu;
		}
		
		//我的动态  店铺用户的个人信息
				@Override
				public ResultUtil findMyProductUserInfo(int userId) throws Exception {
					ResultUtil retu = new ResultUtil();
					List<?> list = findProductMapper
							.findMyProductUserInfo(userId);
					if (list != null && !list.isEmpty()) {
						retu.setId(0);
						retu.setData(list);
						retu.setMsg("成功");
					} else {
						retu.setId(1);
						retu.setData(list);
						retu.setMsg("没有合适的产品");
					}
					return retu;
				}

	@Override
	public ResultUtil selectProductByYcys() throws Exception {
		ResultUtil retu = new ResultUtil();

		List<JskIndexFindProduct> list = findProductMapper
				.selectProductByYcys();
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setMsg("没有合适的产品");
		}
		return retu;
	}

	@Override
	public ResultUtil selectProductByQxdp() throws Exception {
		ResultUtil retu = new ResultUtil();

		List<JskIndexFindProduct> list = findProductMapper
				.selectProductByQxdp();
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有合适的产品");
		}
		return retu;
	}

	@Override
	public ResultUtil selectProductByWjjc() throws Exception {
		ResultUtil retu = new ResultUtil();

		List<JskIndexFindProduct> list = findProductMapper
				.selectProductByWjjc();
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有合适的产品");
		}
		return retu;
	}

	@Override
	public ResultUtil selectProductByJjby() throws Exception {
		ResultUtil retu = new ResultUtil();

		List<JskIndexFindProduct> list = findProductMapper
				.selectProductByJjby();
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setMsg("没有合适的产品");
		}
		return retu;
	}

	@Override
	public ResultUtil selectProductByTc() throws Exception {
		ResultUtil retu = new ResultUtil();

		List<JskIndexFindProduct> list = findProductMapper.selectProductByTc();
		if (list != null && !list.isEmpty()) {
			retu.setId(0);
			retu.setData(list);
			retu.setMsg("成功");
		} else {
			retu.setId(1);
			retu.setData(list);
			retu.setMsg("没有合适的产品");
		}
		return retu;
	}

}
