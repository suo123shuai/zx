/**
 * 
 */
package com.jsk.zx.junit.demo;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jsk.base.common.PageBean;
import com.jsk.base.junit.BaseJunit;
import com.jsk.zx.demo.model.Demo;
import com.jsk.zx.demo.service.IDemoService;
import com.jsk.zx.person.model.JskPersonShop;
import com.jsk.zx.person.service.IJskPersonShopService;

/**
 * @Title: DeomUnit.java
 * @Description: 测试例子
 * @author: lizp
 * @date: 2018年6月13日 下午9:30:21
 */
public class DeomJunit extends BaseJunit {

	@Autowired
	private IDemoService demoService;
	@Autowired
	private IJskPersonShopService jskPersonShopServiceImpl;
	@Test
	// @Transactional 如果需要事务，则加上这个注解
	public void selectListTest() throws Exception {
		Demo demo = new Demo();
		PageBean pageBean = new PageBean();
		pageBean.setTotalRows(demoService.getTotalRows(demo));
		List<Demo> list = demoService.selectList(demo, pageBean);
		System.out.println(list);
	}
	
	@Test
	public void selectListTest1() throws Exception {
		JskPersonShop jskPersonShop = new JskPersonShop();
		jskPersonShop.setUserId(1);
		jskPersonShop.setPayNum(2);
		jskPersonShop.setRecordId(1);
		
		System.out.println(jskPersonShopServiceImpl.saveJskPersonShop(jskPersonShop));
	}

}
