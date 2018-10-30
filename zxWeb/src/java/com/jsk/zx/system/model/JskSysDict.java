/**
 * 
 */
package com.jsk.zx.system.model;

import com.mltt.core.entity.BaseEntity;

/**
 * @Title: JskSysDict.java
 * @Description: 字典表
 * @author: lizp
 * @date: 2018年7月18日 下午4:44:33
 */
public class JskSysDict extends BaseEntity {

	/** */
	private static final long serialVersionUID = -2727095751733763296L;

	/** 字典ID，比如SEX */
	private String dictId;

	/** 字典名称，比如性别 */
	private String dictName;

	/** 字典KEY，比如F */
	private String dictCode;

	/** 字典显示值，比如男 */
	private String dictValue;

	/** 父类ID */
	private Integer parentId;

	/** 排序号 */
	private Integer number;

	/** 字典状态(1可用；0不可用) */
	private String status;

	public JskSysDict() {
		// 如果想要baseController方法需要设置返回页面
		setListPage("/jsk/zx/system/dict/dict_list");
		setFormPage("/jsk/zx/system/dict/dict_form");
		setViewPage("");
	}

	public String getDictId() {
		return dictId;
	}

	public void setDictId(String dictId) {
		this.dictId = dictId;
	}

	public String getDictName() {
		return dictName;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}

	public String getDictCode() {
		return dictCode;
	}

	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}

	public String getDictValue() {
		return dictValue;
	}

	public void setDictValue(String dictValue) {
		this.dictValue = dictValue;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}