package com.xworkz.copy.oct18;

public class TeaSHop {
	public String name;
	public String location;
	public int[] teaPrice;
	public int[] coffeePrice;
	public int[] badamMilkPrice;
	public String[] availableItems;
	public String[] cigaratteBrands;
	public String ownerName;
	public String[] typesOfTea;
	public boolean affordable;
	
	public TeaSHop(String name, String location, int[] teaPrice, int[] coffeePrice, int[] badamMilkPrice, String[] availableItems, String[] cigaratteBrands, String ownerName, String[] typesOfTea, boolean affordable)
	{
		this.name=name;
		this.location=location;
		this.teaPrice=teaPrice;
		this.coffeePrice=coffeePrice;
		this.badamMilkPrice=badamMilkPrice;
		this.availableItems=availableItems;
		this.cigaratteBrands=cigaratteBrands;
		this.ownerName=ownerName;
		this.typesOfTea=typesOfTea;
		this.affordable=affordable;
		
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.location);
		System.out.println(this.ownerName);
		System.out.println(this.affordable);
		
		System.out.println(System.lineSeparator());
		System.out.println("Tea price");
		System.out.println("====================");
		for(int i=0; i<teaPrice.length; i++)
		{
			System.out.println(teaPrice[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("Coffee price");
		System.out.println("=====================");
		for(int i=0; i<coffeePrice.length; i++)
		{
			System.out.println(coffeePrice[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("Badam mlik");
		System.out.println("=====================");
		for(int i=0; i<badamMilkPrice.length; i++)
		{
			System.out.println(badamMilkPrice[i]);
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("Available Items");
		System.out.println("=====================");
		for(int i=0; i<availableItems.length; i++)
		{
			System.out.println(availableItems[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("Cigaratte brands");
		System.out.println("=======================");
		for(int i=0; i<cigaratteBrands.length; i++)
		{
			System.out.println(cigaratteBrands[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("Types of Tea");
		System.out.println("=======================");
		for(int i=0; i<typesOfTea.length; i++)
		{
			System.out.println(typesOfTea[i]);
		}
		
		
		
	}

}
