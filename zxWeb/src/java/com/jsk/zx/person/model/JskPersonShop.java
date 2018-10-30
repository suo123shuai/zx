package com.jsk.zx.person.model;

import java.util.Date;

public class JskPersonShop {
    private Integer pkId;

    private Integer userId;

    private Integer recordId;

    private String type;

    private Integer payNum;

    private Date createTime;

    private String recordName;

    private Float recordPrice;

    private String recordPhoto;

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName == null ? null : recordName.trim();
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
        this.recordPhoto = recordPhoto == null ? null : recordPhoto.trim();
    }
}