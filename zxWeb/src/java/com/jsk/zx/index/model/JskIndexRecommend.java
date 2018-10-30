package com.jsk.zx.index.model;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.mltt.core.entity.BaseEntity;

public class JskIndexRecommend extends BaseEntity {

	/** */
	private static final long serialVersionUID = 4828252287841734371L;
	
	private Integer pkId;

	private String title;

	private String summary;

	private String content;

	private Integer number;

	private Integer photo;

	private Object isShow;

	private JskSysUser JskSysUser;

	private List<com.jsk.zx.login.model.JskSysAnnex> JskSysAnnex;
	
	private MultipartFile file;
	
	public JskIndexRecommend() {
		// 如果想要baseController方法需要设置返回页面
		setListPage("/jsk/zx/index/recommend/recommend_list");
		setFormPage("/jsk/zx/index/recommend/recommend_form");
    }
    
	
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

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getPhoto() {
		return photo;
	}

	public void setPhoto(Integer photo) {
		this.photo = photo;
	}

	public Object getIsShow() {
		return isShow;
	}

	public void setIsShow(Object isShow) {
		this.isShow = isShow;
	}

	public JskSysUser getJskSysUser() {
		return JskSysUser;
	}

	public void setJskSysUser(JskSysUser jskSysUser) {
		JskSysUser = jskSysUser;
	}

	public List<com.jsk.zx.login.model.JskSysAnnex> getJskSysAnnex() {
		return JskSysAnnex;
	}

	public void setJskSysAnnex(List<com.jsk.zx.login.model.JskSysAnnex> jskSysAnnex) {
		JskSysAnnex = jskSysAnnex;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	public String getTableName() {
    	return "JSK_INDEX_RECOMMEND";
    }
}