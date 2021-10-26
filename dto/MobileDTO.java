package com.xworkz.dto;

public class MobileDTO {
	
	private int mobileId;
	private String mobileName;
	private double cost;
	private MemoryDTO memory;
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public MemoryDTO getMemory() {
		return memory;
	}
	public void setMemory(MemoryDTO memory) {
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "MobileDTO [mobileId=" + mobileId + ", mobileName=" + mobileName + ", cost=" + cost + ", memory="
				+ memory + "]";
	}
	
	
	

}
