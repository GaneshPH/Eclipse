package com.xworks.oct31;

public class State {
	
	public String name;
	public String oldName;
	public String cmname;
	public long noofpeople;
	
	public State(String name,String oldName,String cmname,long noofpeople)
	{
		this.name=name;
		this.oldName=oldName;
		this.cmname=cmname;
		this.noofpeople=noofpeople;
	}
		
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.oldName);
		System.out.println(this.cmname);
		System.out.println(this.noofpeople);
	}

}
