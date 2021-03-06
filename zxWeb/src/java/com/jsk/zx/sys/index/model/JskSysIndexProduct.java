package com.jsk.zx.sys.index.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import com.mltt.core.entity.BaseEntity;

public class JskSysIndexProduct extends BaseEntity {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2460324848894039614L;

    private String title;

    private String summary;

    private String content;

    private String type;

    private Integer photo;

    private Float price;

    private String status;

    private Integer praiseNum;

    private Integer commentNum;

    private Integer totalNum;

    private Integer saleNum;

    private Integer standardId;

    private String season;

    private String volume;

    private String bhmzType;

    private String wshlType;

    private Date inTime;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createDate;

    private String brandName;

    private String sunscreen;

    private String effect;

    private String suitSkin;

    private Object isSpecial;
    
    private String isRecommend = "false";

    private MultipartFile file;
    
    public JskSysIndexProduct() {
		// 如果想要baseController方法需要设置返回页面
		setListPage("/jsk/zx/index/product/product_list");
		setFormPage("/jsk/zx/index/product/product_form");
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

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getStandardId() {
        return standardId;
    }

    public void setStandardId(Integer standardId) {
        this.standardId = standardId;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season == null ? null : season.trim();
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume == null ? null : volume.trim();
    }

    public String getBhmzType() {
        return bhmzType;
    }

    public void setBhmzType(String bhmzType) {
        this.bhmzType = bhmzType == null ? null : bhmzType.trim();
    }

    public String getWshlType() {
        return wshlType;
    }

    public void setWshlType(String wshlType) {
        this.wshlType = wshlType == null ? null : wshlType.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getSunscreen() {
        return sunscreen;
    }

    public void setSunscreen(String sunscreen) {
        this.sunscreen = sunscreen == null ? null : sunscreen.trim();
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect == null ? null : effect.trim();
    }

    public String getSuitSkin() {
        return suitSkin;
    }

    public void setSuitSkin(String suitSkin) {
        this.suitSkin = suitSkin == null ? null : suitSkin.trim();
    }

    public Object getIsSpecial() {
        return isSpecial;
    }

    public void setIsSpecial(Object isSpecial) {
        this.isSpecial = isSpecial;
    }

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
	public String getTableName() {
    	return "JSK_INDEX_PRODUCT";
    }

	public String getIsRecommend() {
		return isRecommend;
	}

	public void setIsRecommend(String isRecommend) {
		this.isRecommend = isRecommend;
	}
}
