package com.jsk.zx.person.model;

import java.util.Date;
import java.util.List;

public class JskPersonOrder {
	private String pkId;

	private Integer userId;

	private String type;

	private String status;

	private Integer payNum;

	private Float price;

	private String payType;

	private String addressId;

	private Date createTime;

	private Date updateTime;
	
	private String  express;
	
	private String expressType;
	
	private List<JskPersonAddress> JskPersonAddress;

	private List<JskPersonOrderDetail> JskPersonOrderDetail;

	public String getPkId() {
		return pkId;
	}

	public void setPkId(String pkId) {
		this.pkId = pkId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status == null ? null : status.trim();
	}

	public Integer getPayNum() {
		return payNum;
	}

	public void setPayNum(Integer payNum) {
		this.payNum = payNum;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public List<JskPersonOrderDetail> getJskPersonOrderDetail() {
		return JskPersonOrderDetail;
	}

	public void setJskPersonOrderDetail(
			List<JskPersonOrderDetail> jskPersonOrderDetail) {
		JskPersonOrderDetail = jskPersonOrderDetail;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	

	public String getExpressType() {
		return expressType;
	}

	public void setExpressType(String expressType) {
		this.expressType = expressType == null ? null : expressType.trim();
	}

	public String getExpress() {
		return express;
	}

	public void setExpress(String express) {
		this.express = express == null ? null : express.trim();
	}

	public List<JskPersonAddress> getJskPersonAddress() {
		return JskPersonAddress;
	}

	public void setJskPersonAddress(List<JskPersonAddress> jskPersonAddress) {
		JskPersonAddress = jskPersonAddress;
	}

}