package com.xworkz.copy.oct18;

public class Laptop {
	
	
	public String    name;
    public String    type; 
    public String    invented;
    public int       givenPrice;
    public boolean   freeToUse;
    public String[]  typesOfLaptop;
    public String[]  typesOfOperatingSystems;
    public String[]  typesOfFolders;
    public double[]  price;
    public long[]    totalUserOtherCountry;
    public String[]  countryNames;
    
    public Laptop(String name, String type, String invented, int  givenPrice, boolean freeToUse,String[] typesOfLaptop,String[] typesOfOperatingSystems,String[] typesOfFolders,double[] price,long[] totalUserOtherCountry,String[] countryNames)
    {
   	 this.name = name;
   	 this.type = type;
   	 this.invented = invented;
   	 this.givenPrice = givenPrice;
   	 this.freeToUse = freeToUse;
   	 this.typesOfLaptop = typesOfLaptop;
   	 this.typesOfOperatingSystems = typesOfOperatingSystems;
   	 this.typesOfFolders = typesOfFolders;
   	 this.price = price;;
   	 this.totalUserOtherCountry = totalUserOtherCountry;
   	 this.countryNames = countryNames;	    
			    	 
    }
  


    public void display()
    {
	 
	 System.out.println(this.name);
	 System.out.println(this.type);
	 System.out.println(this.invented);
	 System.out.println(this.givenPrice);
	 System.out.println(this.freeToUse);
	 
	 System.out.println(System.lineSeparator());
	 System.out.println(" Types Of Laptop");
	 System.out.println("=========================");
	 for (int i = 0; i < typesOfLaptop.length; i++)
	 {
		 System.out.println(typesOfLaptop[i]);	 
	 }
	 
	 
	 
	 System.out.println(System.lineSeparator());
	 System.out.println(" Types Of Operating Systems ");
	 System.out.println("=============================");
	 for (int i = 0; i < typesOfOperatingSystems.length; i++) 	 
	 {
		 System.out.println(typesOfOperatingSystems[i]); 
	 }
	 
	 
	 
	 System.out.println(System.lineSeparator());
	 System.out.println("Types Of Folders");
	 System.out.println("=======================");
	 for (int i = 0; i < typesOfFolders.length; i++)     	 
	 {
		System.out.println(typesOfFolders[i]);
	 }
	 
	 
	 
	 System.out.println(System.lineSeparator());
	 System.out.println("Price");
	 System.out.println("==========================");
	 for (int i = 0; i < price.length; i++)
	 {
		System.out.println(price[i]); 
	 }
	 
	 
	 
	 System.out.println(System.lineSeparator());
	 System.out.println("Total User Other Country");
	 System.out.println("==========================");
	 for (int i = 0; i < totalUserOtherCountry.length; i++)
	 {
		System.out.println(totalUserOtherCountry[i]);	 
	 }
	 
	 
	 
	 System.out.println(System.lineSeparator());
	 System.out.println("Country Names");
	 System.out.println("===================");
	 for (int i = 0; i < countryNames.length; i++) 
	 {
		System.out.println(countryNames[i]);	 
	 }
		
    }
	
}

