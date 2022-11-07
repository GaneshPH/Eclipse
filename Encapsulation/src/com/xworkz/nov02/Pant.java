package com.xworkz.nov02;

public class Pant {
	
	private String brandName;
	public String colour = "Blue";
	public int size = 38;
	public boolean matchingForShirt = true;
	public boolean matchingForTShirt = true;
	public boolean matchingForShoes = false;
	public String sellerName;
	public double price;
	public String material;
	public String lengthType;
	public String fitType;
	public String Style;
	
	
	public Pant(String colour, int size, boolean matchingForShirt, boolean matchingForTShirt,
			boolean matchingForShoes, String sellerName, double price, String material, String lengthType,
			String fitType, String style) {
		
		this.colour = colour;
		this.size = size;
		this.matchingForShirt = matchingForShirt;
		this.matchingForTShirt = matchingForTShirt;
		this.matchingForShoes = matchingForShoes;
		this.sellerName = sellerName;
		this.price = price;
		this.material = material;
		this.lengthType = lengthType;
		this.fitType = fitType;
		this.Style = style;
	}
	
	public String getbrandName() {
		return brandName;
	}
	public void setbrandName(String brandName) {
	this.brandName=brandName;
	}
	
	public void showoff() {
		System.out.println("color :"+this.colour );
		System.out.println("size : "+this.size);
		System.out.println("matchingForShirt : "+this.matchingForShirt);
		System.out.println("matchingForTShirt : "+this.matchingForTShirt);
		System.out.println("matchingForShoes :"+this.matchingForShoes);
		System.out.println("sellerName :"+this.sellerName);
		System.out.println("material :"+this.material);
		System.out.println("lengthType :"+this.lengthType);
		System.out.println("fitType :"+this.fitType);
		System.out.println("Style :"+this.Style);
		
		
		
	}

}
