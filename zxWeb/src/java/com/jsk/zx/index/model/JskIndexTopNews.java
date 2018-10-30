package com.jsk.zx.index.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.mltt.core.entity.BaseEntity;

public class JskIndexTopNews extends BaseEntity {
    /** */
	private static final long serialVersionUID = -5713419483816183360L;

    private String title;

    private String summary;

    private String content;

    private Integer photo;

    private String status;

    private List<com.jsk.zx.login.model.JskSysAnnex> JskSysAnnex;
    
    private MultipartFile file;
    
    public JskIndexTopNews() {
		// 如果想要baseController方法需要设置返回页面
		setListPage("/jsk/zx/index/topNews/topNews_list");
		setFormPage("/jsk/zx/index/topNews/topNews_form");
		setViewPage("");
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

	public List<com.jsk.zx.login.model.JskSysAnnex> getJskSysAnnex() {
		return JskSysAnnex;
	}

	public void setJskSysAnnex(List<com.jsk.zx.login.model.JskSysAnnex> jskSysAnnex) {
		JskSysAnnex = jskSysAnnex;
	}
	
	public String getTableName() {
		return "JSK_INDEX_TOPNEWS";
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
}
