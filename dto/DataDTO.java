package com.xworkz.dto;

public class DataDTO {

private String brandName;
private String processor;
private String camera;
public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public String getProcessor() {
	return processor;
}
public void setProcessor(String processor) {
	this.processor = processor;
}
public String getCamera() {
	return camera;
}
public void setCamera(String camera) {
	this.camera = camera;
}
@Override
public String toString() {
	return "DataDTO [brandName=" + brandName + ", processor=" + processor + ", camera=" + camera + "]";
}


}
