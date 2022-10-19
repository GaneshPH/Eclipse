package com.xworkz.copy.oct18;

public class Pizza {
	public String name;
	public int weight;
	public boolean hot;
	public String ShopLocation;
	public String[] typesOfPizza;
	public String[] ingredients;
	public String[] topings;
	public int[] price;
	public char[] sizes;
	public String[] availability;
	
	
	public Pizza(String name, int weight, boolean hot, String shopLocation, String[] typesOfPizza, String[] ingredients,
			String[] topings, int[] price, char[] sizes, String[] availability) 
	
	{
		this.name = name;
		this.weight = weight;
		this.hot = hot;
		this.ShopLocation = shopLocation;
		this.typesOfPizza = typesOfPizza;
		this.ingredients = ingredients;
		this.topings = topings;
		this.price = price;
		this.sizes = sizes;
		this.availability = availability;
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.weight);
		System.out.println(this.hot);
		System.out.println(this.ShopLocation);
		
		System.out.println(System.lineSeparator());
		System.out.println("types Of Pizza");
		System.out.println("====================");
		for(int i=0; i<typesOfPizza.length; i++)
		{
			System.out.println(typesOfPizza[i]);
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("ingredients");
		System.out.println("====================");
		for(int i=0; i<ingredients.length; i++)
		{
			System.out.println(ingredients[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("topings");
		System.out.println("====================");
		for(int i=0; i<topings.length; i++)
		{
			System.out.println(topings[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("price");
		System.out.println("====================");
		for(int i=0; i<price.length; i++)
		{
			System.out.println(price[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("sizes");
		System.out.println("====================");
		for(int i=0; i<sizes.length; i++)
		{
			System.out.println(sizes[i]);
		}
		
		
		
		System.out.println(System.lineSeparator());
		System.out.println("availability");
		System.out.println("====================");
		for(int i=0; i<availability.length; i++)
		{
			System.out.println(availability[i]);
		}
	
	}

}
