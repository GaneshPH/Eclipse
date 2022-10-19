package com.xworkz.copy.oct18;

public class Pastry {
	public String name;
	public String buyername;
	public String shape;
	public int weightInGrams;
	public int noOfLayers;
	public String[] ingredients;
	public String[] madeBy;
	public int[] price;
	public String[] flavour;
	public String[] colour;
	
	
	public Pastry(String name, String buyername, String shape, int weightInGrams, int noOfLayers, String[] ingredients,
			String[] madeBy, int[] price, String[] flavour, String[] colour) {
		
		this.name = name;
		this.buyername = buyername;
		this.shape = shape;
		this.weightInGrams = weightInGrams;
		this.noOfLayers = noOfLayers;
		this.ingredients = ingredients;
		this.madeBy = madeBy;
		this.price = price;
		this.flavour = flavour;
		this.colour = colour;
	}
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.buyername);
		System.out.println(this.shape);
		System.out.println(this.weightInGrams);
		System.out.println(this.noOfLayers);
	
	
		System.out.println(System.lineSeparator());
		System.out.println("Ingredients");
		System.out.println("====================");
		for(int i=0; i<ingredients.length; i++)
		{
			System.out.println(ingredients[i]);
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("Made By");
		System.out.println("====================");
		for(int i=0; i<madeBy.length; i++)
		{
			System.out.println(madeBy[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("price");
		System.out.println("====================");
		for(int i=0; i<price.length; i++)
		{
			System.out.println(price[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("Flavour");
		System.out.println("====================");
		for(int i=0; i<flavour.length; i++)
		{
			System.out.println(flavour[i]);
		}
		
		
		
		System.out.println(System.lineSeparator());
		System.out.println("Colour");
		System.out.println("====================");
		for(int i=0; i<colour.length; i++)
		{
			System.out.println(colour[i]);
		}
	
	}
		
}

