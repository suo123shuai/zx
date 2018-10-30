package com.jsk.zx.index.model;

import org.springframework.web.multipart.MultipartFile;

import com.mltt.core.entity.BaseEntity;

public class JskIndexKnowledge extends BaseEntity{

	/** */
	private static final long serialVersionUID = -2460324848894039614L;

	/*标题*/
    private String title;
    
    /*摘要*/
    private String summary;
    
    /*内容*/
    private String content;
    
    /*图片*/
    private Integer photo;
    
    /*状态*/
    private String status;
    
    /** 附件 */
    private MultipartFile file;
    
    public JskIndexKnowledge() {
		// 如果想要baseController方法需要设置返回页面
		setListPage("/jsk/zx/index/knowledge/knowledge_list");
		setFormPage("/jsk/zx/index/knowledge/knowledge_form");
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

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	public String getTableName() {
    	return "JSK_INDEX_KNOWLEDGE";
    }

}