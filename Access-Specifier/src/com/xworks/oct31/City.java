package com.xworks.oct31;

public class City {
	
	public String name;
	public String capitalCity;
	public double areaInSquareKilometer;
	public int number;
	
	public City(String name,String capitalCity,double areaInSquareKilometer,int number) 
	{
		this.name=name;
		this.capitalCity=capitalCity;
		this.areaInSquareKilometer=areaInSquareKilometer;
		this.number=number;
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.capitalCity);
		System.out.println(this.areaInSquareKilometer);
		System.out.println(this.number);
		
	}

}
