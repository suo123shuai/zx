/**
 * 
 */
package com.jsk.zx.demo.model;

import com.jsk.base.model.BaseModel;

/**
 * @Title: Demo.java
 * @Description: 例子 
 * @author: lizp
 * @date: 2018-6-7 上午10:17:19
 */
public class Demo extends BaseModel{

	/** 姓名 */
	private String demoName;
	
	/** 地址 */
	private String demoAddress;

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
