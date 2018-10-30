package com.jsk.zx.index.model;

import java.util.Date;
import java.util.List;

public class JskIndexUserNews {
    private Integer pkId;

    private Integer userId;

    private Integer newsId;

    private String status;

    private Date createTime;

    private Integer createId;
    
    private JskIndexNews jskIndexNews;

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

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

	public JskIndexNews getJskIndexNews() {
		return jskIndexNews;
	}

	public void setJskIndexNews(JskIndexNews jskIndexNews) {
		this.jskIndexNews = jskIndexNews;
	}
}