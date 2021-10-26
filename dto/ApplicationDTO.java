package com.xworkz.dto;

public class ApplicationDTO {
	
	private String appName;
	private int appId;
	private DataDTO data;
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public DataDTO getData() {
		return data;
	}
	public void setData(DataDTO data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ApplicationDTO [appName=" + appName + ", appId=" + appId + ", data=" + data + "]";
	}
	
	

}
