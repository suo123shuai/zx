package com.jsk.base.common;

import java.io.Serializable;

/**
 * @Title: PageBean.java
 * @Description: 分页组件
 * @author: lizp
 * @date: 2018-6-7 下午9:06:41
 */
public class PageBean implements Serializable {

	/** */
	private static final long serialVersionUID = 846098588590154506L;

	/** 每页条数 */
	private int pageSize = Constant.PAGE_SIZE;

	/** 总页数 */
	private long totalPages = 0;

	/** 当前页数 */
	private int pageNum = 1;

	/** 总行数 */
	private long totalRows = 0;

	/** 分页开始行数 */
	private int startNum;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public long getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(long totalRows) {
		this.totalRows = totalRows;
		if (this.totalRows < this.pageSize) {
			this.totalPages = 1;
		} else {
			this.totalPages = this.totalRows % getPageSize() == 0 ? this.totalRows % getPageSize() : this.totalRows
					% getPageSize() + 1;
		}
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getStartNum() {
		this.startNum = (this.pageNum - 1) * this.pageSize;
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

}
