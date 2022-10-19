package com.xworkz.copy.oct18;

public class ShoppingMall {
	public String[] name;
	public String[] location;
	public int[] shopsInMall;
	public String[] typeOfShops;
	public String[] nameOfShops;
	public String[] shopOwnerName;
	public boolean availabilityofClothes;
	public int numberofShoppingMalls;
	public long totalTunover;
	public boolean parkingSpace;
	
	
	
	public ShoppingMall(String[] name, String[] location, int[] shopsInMall, String[] typeOfShops, String[] nameOfShops,
			String[] shopOwnerName, boolean availabilityofClothes, int numberofShoppingMalls, long totalTunover,
			boolean parkingSpace) 
	{
		
		this.name = name;
		this.location = location;
		this.shopsInMall = shopsInMall;
		this.typeOfShops = typeOfShops;
		this.nameOfShops = nameOfShops;
		this.shopOwnerName = shopOwnerName;
		this.availabilityofClothes = availabilityofClothes;
		this.numberofShoppingMalls = numberofShoppingMalls;
		this.totalTunover = totalTunover;
		this.parkingSpace = parkingSpace;
	}
	
	public void display()
	{
		System.out.println(this.availabilityofClothes);
		System.out.println(this.numberofShoppingMalls);
		System.out.println(this.totalTunover);
		System.out.println(this.parkingSpace);
		
		System.out.println(System.lineSeparator());
		System.out.println("Name");
		System.out.println("====================");
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("Location");
		System.out.println("====================");
		for(int i=0; i<location.length; i++)
		{
			System.out.println(location[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("shops In Mall");
		System.out.println("====================");
		for(int i=0; i<shopsInMall.length; i++)
		{
			System.out.println(shopsInMall[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("type Of Shops");
		System.out.println("====================");
		for(int i=0; i<typeOfShops.length; i++)
		{
			System.out.println(typeOfShops[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("name Of Shops");
		System.out.println("====================");
		for(int i=0; i<nameOfShops.length; i++)
		{
			System.out.println(nameOfShops[i]);
		}
		
		
		
		System.out.println(System.lineSeparator());
		System.out.println("shop OwnerName");
		System.out.println("====================");
		for(int i=0; i<shopOwnerName.length; i++)
		{
			System.out.println(shopOwnerName[i]);
		}
	
	}

}
