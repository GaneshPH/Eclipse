package com.xworkz.inheritance.Nov8;

public class CateringWedding extends Catering{
	
	public long contactNumber;

	public CateringWedding(String catererName, String style, boolean tasteIsGood, long contactNumber) {
		super(catererName, style, tasteIsGood);
		this.contactNumber = contactNumber;
	}

	

	
}
