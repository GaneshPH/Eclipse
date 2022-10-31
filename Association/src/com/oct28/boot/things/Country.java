package com.oct28.boot.things;

public class Country {
	public String name;
	public City[] cities;
	public President president;
	
	public Country(String name) 
	{
		this.name=name;
	}
	public void setCities(City[] cities) 
	{
		this.cities=cities;
	}
     public void setPresident(President president) 
     {
    	 this.president=president;
     }
	public void display()
	{
	    if(cities!=null) {
	    for (int i = 0; i < cities.length; i++)
	 {
		City city=cities[i];
		if(city!=null)
		{
		  System.out.println("president capital area");	
		  city.display();
		
	     }
	}
	}
	
	if(president!=null) 
	{
		System.out.println("country name president name");
		this.president.display();
	}
	}

}
