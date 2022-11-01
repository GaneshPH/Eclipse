package com.xworks.oct31;

public class Email {

	
	public String id;
	public long password;
	public long mobilenumber;
	public Company company=new Company("Xworkz","Ganesh");
	
	public Email() {
		super();
	}
	public Email(String id,long password,long mobilenumber) {
		this.id=id;
		this.password=password;
		this.mobilenumber=mobilenumber;
	}
	//
	public void display() {
		System.out.println(this.id);
		System.out.println(this.password);
		System.out.println(this.mobilenumber);
	}
}
