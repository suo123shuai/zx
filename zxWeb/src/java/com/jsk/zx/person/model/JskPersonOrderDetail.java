package com.jsk.zx.person.model;

import java.util.Date;
import java.util.List;

public class JskPersonOrderDetail {
    private Integer pkId;

    private String orderId;

    private Integer recordId;

    private Integer payNum;

    private String standard;

    private Float price;

    private Date createTime;

    private Date updateTime;
    
    private String recordName;
    
    private Float recordPrice;
    
    private String recordPhoto;
    
    private List<JskIndexProduct> JskIndexProduct;
    
    private List<JskIndexService> JskIndexService;
    
    private List<JskPersonMarket> JskPersonMarket;

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }


    public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getPayNum() {
        return payNum;
    }

    public void setPayNum(Integer payNum) {
        this.payNum = payNum;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
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

	public String getRecordName() {
		return recordName;
	}

	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}

	public Float getRecordPrice() {
		return recordPrice;
	}

	public void setRecordPrice(Float recordPrice) {
		this.recordPrice = recordPrice;
	}

	public String getRecordPhoto() {
		return recordPhoto;
	}

	public void setRecordPhoto(String recordPhoto) {
		this.recordPhoto = recordPhoto;
	}

	public List<JskIndexProduct> getJskIndexProduct() {
		return JskIndexProduct;
	}

	public void setJskIndexProduct(List<JskIndexProduct> jskIndexProduct) {
		JskIndexProduct = jskIndexProduct;
	}

	public List<JskIndexService> getJskIndexService() {
		return JskIndexService;
	}

	public void setJskIndexService(List<JskIndexService> jskIndexService) {
		JskIndexService = jskIndexService;
	}

	public List<JskPersonMarket> getJskPersonMarket() {
		return JskPersonMarket;
	}

	public void setJskPersonMarket(List<JskPersonMarket> jskPersonMarket) {
		JskPersonMarket = jskPersonMarket;
	}

	@Override
	public String toString() {
		return "JskPersonOrderDetail [pkId=" + pkId + ", orderId=" + orderId
				+ ", recordId=" + recordId + ", payNum=" + payNum
				+ ", standard=" + standard + ", price=" + price
				+ ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", recordName=" + recordName + ", recordPrice=" + recordPrice
				+ ", recordPhoto=" + recordPhoto + ", JskIndexProduct="
				+ JskIndexProduct + ", JskIndexService=" + JskIndexService
				+ ", JskPersonMarket=" + JskPersonMarket + "]";
	}
}