package com.xworkz.copy.oct18;

public class Car {
	
	public String[] carName;
	public int[] yearOfManufactured;
	public int[] carPrice;
	public String[] carVarient;
	public String[] maxSpeeed;
	public String[] carNumber;
	public String showrromLocation;
	public String showrromName;
	public int carsInShowrrom;
	public int noOfTyres;
	
	public Car(String[] carName, int[] yearOfManufactured, int[] carPrice, String[] carVarient, String[] maxSpeeed,
			String[] carNumber, String showrromLocation, String showrromName, int carsInShowrrom, int noOfTyres) 
	{
		this.carName = carName;
		this.yearOfManufactured = yearOfManufactured;
		this.carPrice = carPrice;
		this.carVarient = carVarient;
		this.maxSpeeed = maxSpeeed;
		this.carNumber = carNumber;
		this.showrromLocation = showrromLocation;
		this.showrromName = showrromName;
		this.carsInShowrrom = carsInShowrrom;
		this.noOfTyres = noOfTyres;
	}
	
	public void display()
	{
		System.out.println(this.showrromLocation);
		System.out.println(this.showrromName);
		System.out.println(this.carsInShowrrom);
		System.out.println(this.noOfTyres);
		
		System.out.println(System.lineSeparator());
		System.out.println("car Name");
		System.out.println("====================");
		for(int i=0; i<carName.length; i++)
		{
			System.out.println(carName[i]);
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("year Of Manufactured");
		System.out.println("====================");
		for(int i=0; i<yearOfManufactured.length; i++)
		{
			System.out.println(yearOfManufactured[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("car Price");
		System.out.println("====================");
		for(int i=0; i<carPrice.length; i++)
		{
			System.out.println(carPrice[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("car Varient");
		System.out.println("====================");
		for(int i=0; i<carVarient.length; i++)
		{
			System.out.println(carVarient[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("max Speeed");
		System.out.println("====================");
		for(int i=0; i<maxSpeeed.length; i++)
		{
			System.out.println(maxSpeeed[i]);
		}
		
		
		
		System.out.println(System.lineSeparator());
		System.out.println("car Number");
		System.out.println("====================");
		for(int i=0; i<carNumber.length; i++)
		{
			System.out.println(carNumber[i]);
		}
	

}
	
}
