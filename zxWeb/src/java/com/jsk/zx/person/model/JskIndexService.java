package com.jsk.zx.person.model;

import java.util.Date;
import java.util.List;

import com.jsk.zx.index.model.JskIndexWork;
import com.jsk.zx.index.model.JskServiceWork;
import com.jsk.zx.index.model.JskSysUser;

public class JskIndexService {
    private Integer pkId;

    private String title;

    private String summary;

    private String content;

    private String address;

    private Float area;

    private Date startDate;

    private Date endDate;

    private String type;

    private String remark;

    private Integer photo;

    private Float price;

    private String status;

    private Integer praiseNum;

    private Integer commentNum;

    private Integer workId;

    private Date createTime;

    private Integer createId;

    private Date updateTime;

    private Integer updateId;

    private String serviceType;

    private String serviceSign;
    
    private List<JskSysUser> JskSysUser;
    
   private List<JskIndexWork>  JskIndexWork;
    
    private List<JskServiceWork> JskServiceWork;
    
    private JskSysAnnex jskSysAnnex;

    public Integer getPkId() {
        return pkId;
    }

    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getPhoto() {
        return photo;
    }

    public void setPhoto(Integer photo) {
        this.photo = photo;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getPraiseNum() {
        return praiseNum;
    }

    public void setPraiseNum(Integer praiseNum) {
        this.praiseNum = praiseNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getServiceSign() {
        return serviceSign;
    }

    public void setServiceSign(String serviceSign) {
        this.serviceSign = serviceSign == null ? null : serviceSign.trim();
    }

	public List<JskIndexWork> getJskIndexWork() {
		return JskIndexWork;
	}

	public void setJskIndexWork(List<JskIndexWork> jskIndexWork) {
		JskIndexWork = jskIndexWork;
	}

	public List<JskServiceWork> getJskServiceWork() {
		return JskServiceWork;
	}

	public void setJskServiceWork(List<JskServiceWork> jskServiceWork) {
		JskServiceWork = jskServiceWork;
	}

	public List<JskSysUser> getJskSysUser() {
		return JskSysUser;
	}

	public void setJskSysUser(List<JskSysUser> jskSysUser) {
		JskSysUser = jskSysUser;
	}

	public JskSysAnnex getJskSysAnnex() {
		return jskSysAnnex;
	}

	public void setJskSysAnnex(JskSysAnnex jskSysAnnex) {
		this.jskSysAnnex = jskSysAnnex;
	}
}