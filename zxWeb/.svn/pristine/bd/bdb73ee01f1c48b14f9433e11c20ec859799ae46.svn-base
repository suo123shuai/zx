package com.jsk.zx.index.model;

import org.springframework.web.multipart.MultipartFile;

import com.mltt.core.entity.BaseEntity;

public class JskIndexNews extends BaseEntity {
    /** */
	private static final long serialVersionUID = -2579795074973240741L;

    private String title;

    private String summary;

    private String content;

    private String type;

    private Integer photo;

    private String status;
    
    private MultipartFile file;
    
    public JskIndexNews() {
		// 如果想要baseController方法需要设置返回页面
		setListPage("/jsk/zx/index/news/news_list");
		setFormPage("/jsk/zx/index/news/news_form");
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getPhoto() {
        return photo;
    }

    public void setPhoto(Integer photo) {
        this.photo = photo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
    
    public String getTableName() {
    	return "JSK_INDEX_NEWS";
    }

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}