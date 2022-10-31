package com.oct28.boot.things.enumm;

public enum GenderName {
MALE("male"),FEMALE("female"),OTHER("other");
	
	public String name;
	private GenderName(String name) {
		this.name=name;
		
	}

}
