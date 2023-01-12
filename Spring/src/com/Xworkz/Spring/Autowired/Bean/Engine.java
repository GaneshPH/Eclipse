package com.Xworkz.Spring.Autowired.Bean;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Engine {
	private String name;
	private String type;
	@Value("9000")
	private int number;
	@Value("8.02")
	private double version;
	private String company;
	private int strokes;
	
	@Autowired
	public Engine(@Qualifier("nameOfEngine") String name, 
			@Qualifier("typeofEngine") String type,
			@Qualifier("companyName") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company=company;
	}
	
	
	@Value("4")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}
	public int getStrokes() {
		return strokes;
	}


	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}
	

}
