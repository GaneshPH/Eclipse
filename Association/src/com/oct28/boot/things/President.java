package com.oct28.boot.things;

import com.oct28.boot.things.enumm.*;

public class President {

	public String name;
	public GenderName genderName=GenderName.MALE;
	public int tenure=5;
	
	public President(String name)
	{
		this.name=name;
	}
	public void setGender(GenderName genderName)
	{
		this.genderName=genderName;
		
	}
	public void display() {
		
		System.out.println(this.name);
		System.out.println(this.genderName);
		System.out.println(this.tenure);
		if(genderName!=null)
		{
			System.out.println(this.genderName);
		}
	}
}
