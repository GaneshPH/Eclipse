package com.xworkz.inheritance.Nov9;

public class BJP extends PoliticalParty{
	public String fullForm;

	public BJP(String officeLocation, String partyName, String fullForm) {
		super(officeLocation, partyName);
		this.fullForm = fullForm;
	}
	
	public void display() {
		super.display();
		System.out.println("Full Form: "+fullForm);
	}
	

}
