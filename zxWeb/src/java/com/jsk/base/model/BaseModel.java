/**
 * 
 */
package com.jsk.base.model;

import java.util.Date;

/**
 * @Title: BaseModel.java
 * @Description: TODO 
 * @author: lizp
 * @date: 2018-6-7 上午10:18:22
 */
public class BaseModel {

	/** 主键 */
	private Integer pkId;
	
	/** 创建人 */
	private Integer createId;
	
	/** 创建时间 */
	private Date createTime = new Date();
	
	/** 修改人 */
	private Integer updateId;
	
	/** 修改时间 */
	private Date updateTime;


	

	public Integer getCreateId() {
		return createId;
	}

	public void setCreateId(Integer createId) {
		this.createId = createId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getUpdateId() {
		return updateId;
	}

	public void setUpdateId(Integer updateId) {
		this.updateId = updateId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getPkId() {
		return pkId;
	}

	public void setPkId(Integer pkId) {
		this.pkId = pkId;
	}
	
}
