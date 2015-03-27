/**
 * 
 */
package com.zhuc.mybatis.utils;

import java.util.Map;


/**
 * @title 		
 * @description	
 * @usage		
 * @copyright	Copyright 2011  SHCMCT Corporation. All rights reserved.
 * @company		上海中移通信技术工程有限公司
 * @author		John.Yao
 * @create		2012-11-15 下午10:12:41
 */
public class RequestBean {

	private String navTabId;

	private String sortName;

	private String sortType;

	private int pageNumber;

	private int totalPages;

	private int numPerPage = ResourceDef.PAGE_SIZE;

	private Map<String, Object> param;

	public String getNavTabId() {
		return navTabId;
	}

	public void setNavTabId(String navTabId) {
		this.navTabId = navTabId;
	}

	public String getSortName() {
		return sortName;
	}

	public void setSortName(String sortName) {
		this.sortName = sortName;
	}

	public String getSortType() {
		return sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public Map<String, Object> getParam() {
		return param;
	}

	public void setParam(Map<String, Object> param) {
		this.param = param;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getNumPerPage() {
		return numPerPage;
	}

	/**
	 * @param numPerPage the numPerPage to set
	 */
	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

}
