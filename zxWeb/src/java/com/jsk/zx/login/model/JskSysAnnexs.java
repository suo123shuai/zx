package com.jsk.zx.login.model;

import java.util.Arrays;

public class JskSysAnnexs extends JskSysAnnex {
	/**
	 * 上传文件
	 */
	private byte[] file;
	
	/**
	 * 文件类型
	 */
	private String type;

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "JskSysAnnexs [file=" + Arrays.toString(file) + ", type=" + type
				+ ", getFile()=" + Arrays.toString(getFile()) + ", getType()="
				+ getType() + ", getPkId()=" + getPkId() + ", getFileName()="
				+ getFileName() + ", getFileOriginalName()="
				+ getFileOriginalName() + ", getFilePath()=" + getFilePath()
				+ ", getFileSize()=" + getFileSize() + ", getFileSuffix()="
				+ getFileSuffix() + ", getTableName()=" + getTableName()
				+ ", getRecordId()=" + getRecordId() + ", getRecordField()="
				+ getRecordField() + ", getCreateTime()=" + getCreateTime()
				+ ", getCreateId()=" + getCreateId() + ", getUpdateTime()="
				+ getUpdateTime() + ", getUpdateId()=" + getUpdateId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	

}
