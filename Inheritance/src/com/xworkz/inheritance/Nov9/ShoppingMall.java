package com.xworkz.inheritance.Nov9;

public class ShoppingMall {
	public String location;
	public String openingDate;
	
	
	public ShoppingMall(String location, String openingDate) {
		super();
		this.location = location;
		this.openingDate = openingDate;
	}
	
	public void display() {
		System.out.println("Location: "+location);
		System.out.println("Opening Date: "+openingDate);
		
	}
	

}
