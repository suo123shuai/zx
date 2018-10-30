package com.jsk.zx.system.model;

import java.util.Date;

import com.mltt.core.entity.BaseEntity;

public class JskPersonComment extends BaseEntity {
    /** */
	private static final long serialVersionUID = 1L;

	private Integer pkId;

    private Integer userId;

    private Integer recordId;

    private String type;

    private String commentType;

    private Integer annex;

    private String content;

    private String status;

    private Date createTime;
    public JskPersonComment() {
		// 如果想要baseController方法需要设置返回页面
		setListPage("/jsk/zx/system/dict/dict_list");
		setFormPage("/jsk/zx/system/dict/dict_form");
		setViewPage("");
	}
    public String getTableName() {
        return "JSK_PERSON_COMMENT";
    }
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

    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType == null ? null : commentType.trim();
    }

    public Integer getAnnex() {
        return annex;
    }

    public void setAnnex(Integer annex) {
        this.annex = annex;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
}