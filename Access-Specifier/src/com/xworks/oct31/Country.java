package com.xworks.oct31;

public class Country {
	
	public String name;
	public String Presidentname;
	public String Cityname;
	public double areaInSquareKilometer;
	
	public Country(String name,String Presidentname,String Cityname, double AreaInSquareKilometer) 
	{
		
		this.name=name;
		this.Presidentname=Presidentname;
		this.Cityname=Cityname;
		this. areaInSquareKilometer= areaInSquareKilometer;
	}
	public void display() 
	{
		System.out.println(this.name);
		System.out.println(this.Presidentname);
		System.out.println(this.Cityname);
		System.out.println(this.areaInSquareKilometer);
		
	}

}
