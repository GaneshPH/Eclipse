package com.xworks.oct31;

public class Person {
	
	public String name;
	public Email[]email = new Email[10];
	public Job job=new Job(56565656,"Software Engineer",5);

	public Person() {
		//super();
	}
	public Person( String name) {
		
		this.name=name;
	}
	//
	public void setEmail(Email[]email) {
		this.email=email;
	}
	//
	public void display() {
		System.out.println(this.name);
	for (int i = 0; i < email.length; i++) {
		Email number=this.email[i];
		System.out.println(number);
		
		if(number!=null) {
			number.display();
		}
		else
		{
			System.out.println("email is null or empty");
		}
			}
	}

}
