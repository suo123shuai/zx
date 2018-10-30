package com.jsk.zx.index.model;

import java.util.Date;
import java.util.List;

import com.jsk.base.model.BaseModel;
import com.jsk.zx.index.model.JskUserWork;

public class JskIndexFindWorker extends BaseModel{

	private String loginName;

    private String loginPwd;

    private String userName;

    private String nickName;

    private String mobile;

    private String telephone;

    private String sex;

    private String email;

    private String status;

    private String reason;

    private String type;

    private String identify;
    
    private String birthday;
    
    private Integer age;

    private String city;

    private String address;

    private String workType;

    private String workTypeSmall;

    private Integer identifyFacad;

    private Integer identifyBack;

    private Integer cardPhoto;

    private Integer headPhoto;

    private String skill;

    private String space;

    private String appraise;

    private Integer permitPhoto;

    private String companySpace;

    private String companyType;

    private String product;

    private Integer bankcardId;

    private Integer praiseNum;

    private Integer commentNum;

    private Date createTime;

    private Date updateTime;

    private Integer updateId;
    
    private String findType;
    
    
    
    private List<com.jsk.zx.login.model.JskSysAnnex> JskSysAnnex;
    
    private List<JskUserWork>  JskUserWork;
    
    private List<JskIndexWork> JskIndexWork;
    

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify == null ? null : identify.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType == null ? null : workType.trim();
    }

    public String getWorkTypeSmall() {
        return workTypeSmall;
    }

    public void setWorkTypeSmall(String workTypeSmall) {
        this.workTypeSmall = workTypeSmall == null ? null : workTypeSmall.trim();
    }

    public Integer getIdentifyFacad() {
        return identifyFacad;
    }

    public void setIdentifyFacad(Integer identifyFacad) {
        this.identifyFacad = identifyFacad;
    }

    public Integer getIdentifyBack() {
        return identifyBack;
    }

    public void setIdentifyBack(Integer identifyBack) {
        this.identifyBack = identifyBack;
    }

    public Integer getCardPhoto() {
        return cardPhoto;
    }

    public void setCardPhoto(Integer cardPhoto) {
        this.cardPhoto = cardPhoto;
    }

    public Integer getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(Integer headPhoto) {
        this.headPhoto = headPhoto;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space == null ? null : space.trim();
    }

    public String getAppraise() {
        return appraise;
    }

    public void setAppraise(String appraise) {
        this.appraise = appraise == null ? null : appraise.trim();
    }

    public Integer getPermitPhoto() {
        return permitPhoto;
    }

    public void setPermitPhoto(Integer permitPhoto) {
        this.permitPhoto = permitPhoto;
    }

    public String getCompanySpace() {
        return companySpace;
    }

    public void setCompanySpace(String companySpace) {
        this.companySpace = companySpace == null ? null : companySpace.trim();
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public Integer getBankcardId() {
        return bankcardId;
    }

    public void setBankcardId(Integer bankcardId) {
        this.bankcardId = bankcardId;
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

    public Integer getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Integer updateId) {
        this.updateId = updateId;
    }

	public String getFindType() {
		return findType;
	}

	public void setFindType(String findType) {
		this.findType = findType;
	}

	public List<com.jsk.zx.login.model.JskSysAnnex> getJskSysAnnex() {
		return JskSysAnnex;
	}

	public void setJskSysAnnex(List<com.jsk.zx.login.model.JskSysAnnex> jskSysAnnex) {
		JskSysAnnex = jskSysAnnex;
	}


	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<JskUserWork> getJskUserWork() {
		return JskUserWork;
	}

	public void setJskUserWork(List<JskUserWork> jskUserWork) {
		JskUserWork = jskUserWork;
	}

	public List<JskIndexWork> getJskIndexWork() {
		return JskIndexWork;
	}

	public void setJskIndexWork(List<JskIndexWork> jskIndexWork) {
		JskIndexWork = jskIndexWork;
	}
}