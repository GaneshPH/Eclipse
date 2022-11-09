package com.xworkz.inheritance.Nov9;

public class OrionMall extends ShoppingMall{
	public boolean overallGood;

	public OrionMall(String location, String openingDate, boolean overallGood) {
		super(location, openingDate);
		this.overallGood=overallGood;
	}
	
	public void display() {
		super.display();
		System.out.println("Shapping Mall "+overallGood);
	}
	
	

	
	
}
