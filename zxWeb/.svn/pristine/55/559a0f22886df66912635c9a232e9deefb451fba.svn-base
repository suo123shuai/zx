package com.jsk.zx.demo.model;

import com.mltt.core.entity.BaseEntity;

/**
 * @Title: DemoEntity.java
 * @Description: 泛型例子 
 * @author: lizp
 * @date: 2018年7月11日 下午4:08:34
 */
public class DemoEntity extends BaseEntity{

	/** */
	private static final long serialVersionUID = -709467683954489020L;
	
	/** 姓名 */
	private String demoName;
	
	/** 地址 */
	private String demoAddress;
	
	public DemoEntity() {
		// 如果想要baseController方法需要设置返回页面
		setListPage("/jsk/zx/demo/demoEntity_list");
		setFormPage("/jsk/zx/demo/demoEntity_form");
		setViewPage("");
	}

	public String getDemoName() {
		return demoName;
	}

	public void setDemoName(String demoName) {
		this.demoName = demoName;
	}

	public String getDemoAddress() {
		return demoAddress;
	}

	public void setDemoAddress(String demoAddress) {
		this.demoAddress = demoAddress;
	}

}
