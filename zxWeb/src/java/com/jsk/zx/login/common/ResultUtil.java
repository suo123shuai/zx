package com.jsk.zx.login.common;

import java.io.Serializable;
import java.util.List;


public class ResultUtil implements Serializable{
	
	/** */
	private static final long serialVersionUID = 1L;
	private int id;
	private String msg;
	private List<?> data;
	
	public List<?> getData() {
		return data;
	}
	public void setData(List<?> data) {
		this.data = data;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "ResultUtil [id=" + id + ", msg=" + msg + ", data=" + data + "]";
	}
	

}