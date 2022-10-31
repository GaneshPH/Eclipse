package com.xworks.oct31;

public class Job {
	
	public long salary;
	public String role;
	public int bond;
	public Company company=new Company("Xworkz","Ganesh");
	
	public Job() {
		
	}
	//
	public Job(long salary, String role,int bond) 
	{
		this.salary=salary;
		this.role=role;
		this.bond=bond;
	}
	//
	public void display()
	{
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
	}

}
