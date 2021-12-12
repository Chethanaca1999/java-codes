package com.xworkz.interface1.president;

public interface PresidentInterface {
	
	
	boolean search(PresidentDto dto1 , String str2);

	static boolean search(PresidentDto dto1, int i) {
		return false;
	}
}