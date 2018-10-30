package com.jsk.zx.system.model;

import java.util.Date;

import com.mltt.core.entity.BaseEntity;


public class JskSysUser extends BaseEntity{
    /** */
	private static final long serialVersionUID = 1765407328711350514L;

    /** 登录名 */
    private String loginName;

    /** 登录密码 */
    private String loginPwd;

    /** 用户名 */
    private String userName;

    /** 昵称 */
    private String nickName;

    /** 手机 */
    private String mobile;

    /** 固话 */
    private String telephone;

    /** 性别 */
    private String sex;

    /** 邮箱 */
    private String email;

    /** 状态 */
    private String status;

    /** 审核意见 */
    private String reason;

    /** 用户类别 */
    private String type;

    /** 身份证号 */
    private String identify;

    /** 所在城市 */
    private String city;

    /** 地址 */
    private String address;

    private String workType;

    private String workTypeSmall;

    private Integer identifyFacad;
    /**
     * 身份证正面
     */
    private String identifyFacada;

	private Integer identifyBack;
	
	 /**
     * 身份证反面
     */
    private String identifyBacka;

    private Integer cardPhoto;
    
    /**
     * 手持身份证或店铺照片地址
     */
    private String cardPhotoa;

    private Integer headPhoto;

    private String skill;

    private String space;

    private String appraise;

    private Integer permitPhoto;
    
    /**
     * 营业执照
     */
    private String permitPhotoa;

    private String companySpace;

    private String companyType;

    private String product;

    private Integer bankcardId;

    private Integer praiseNum;

    private Integer commentNum;

    private String findType;
    
    private String birthday;
    
    private int age;
    
    private String assureMoney;
    
    private int rank;
    
    private float rate;
    
    private int integralTotal;
    
    private int integral;
    
    private Date checkTime;
    
    private int checkId;
    
    private float balance;
    
    private String companyName;
    
    private String idNumber;
    
    private String companyNumber;
    
    public JskSysUser() {
		// 如果想要baseController方法需要设置返回页面
		setListPage("/jsk/zx/system/user/user_list");
		setFormPage("/jsk/zx/system/user/user_form");
    }

    public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getIdentifyFacada() {
		return identifyFacada;
	}

	public void setIdentifyFacada(String identifyFacada) {
		this.identifyFacada = identifyFacada;
	}


	public String getIdentifyBacka() {
		return identifyBacka;
	}

	public void setIdentifyBacka(String identifyBacka) {
		this.identifyBacka = identifyBacka;
	}

	public String getCardPhotoa() {
		return cardPhotoa;
	}

	public void setCardPhotoa(String cardPhotoa) {
		this.cardPhotoa = cardPhotoa;
	}

	public String getPermitPhotoa() {
		return permitPhotoa;
	}

	public void setPermitPhotoa(String permitPhotoa) {
		this.permitPhotoa = permitPhotoa;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

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

    public String getFindType() {
        return findType;
    }

    public void setFindType(String findType) {
        this.findType = findType == null ? null : findType.trim();
    }

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAssureMoney() {
		return assureMoney;
	}

	public void setAssureMoney(String assureMoney) {
		this.assureMoney = assureMoney;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public int getIntegralTotal() {
		return integralTotal;
	}

	public void setIntegralTotal(int integralTotal) {
		this.integralTotal = integralTotal;
	}

	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

	public Date getCheckTime() {
		return checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public int getCheckId() {
		return checkId;
	}

	public void setCheckId(int checkId) {
		this.checkId = checkId;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public String getTableName() {
    	return "JSK_SYS_USER";
    }
}