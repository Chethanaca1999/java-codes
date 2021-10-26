package com.xworkz.dto;

public class MemoryDTO {
	
	private int memoryId;
	private String capacity;
	private ApplicationDTO application;
	public int getMemoryId() {
		return memoryId;
	}
	public void setMemoryId(int memoryId) {
		this.memoryId = memoryId;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public ApplicationDTO getApplication() {
		return application;
	}
	public void setApplication(ApplicationDTO application) {
		this.application = application;
	}
	@Override
	public String toString() {
		return "MemoryDTO [memoryId=" + memoryId + ", capacity=" + capacity + ", application=" + application + "]";
	}
	
	

}
