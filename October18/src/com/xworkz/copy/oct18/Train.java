package com.xworkz.copy.oct18;

public class Train {

	public String name;
	public String from;
	public String to;
	public String departure;
	public String date;
	public String[] viaRoutes;
	public String[] crossingTrains;
	public int[] platformNoInJunctions;
	public String[] tiffanInTrain;
	public String[] snacksInTrain;
	public String[] coachNumbers;
	
	public Train(String name, String from, String to, String departure, String date, String[] viaRoutes, String[] crossingTrains, int[] platformNoInJunctions, String[] tiffanInTrain,  String[] snacksInTrain, String[] coachNumbers)
	{
		this.name=name;
		this.from=from;
		this.to=to;
		this.departure=departure;
		this.viaRoutes=viaRoutes;
		this.crossingTrains=crossingTrains;
		this.platformNoInJunctions=platformNoInJunctions;
		this.tiffanInTrain=tiffanInTrain;
		this.snacksInTrain=snacksInTrain;
		this.coachNumbers=coachNumbers;	
	}
	
	public void display()
	{
	System.out.println(this.name);
	System.out.println(this.from);
	System.out.println(this.to);
	System.out.println(this.departure);
	
	System.out.println(System.lineSeparator());
	System.out.println("Via Routes");
	System.out.println("====================");
	for(int i=0; i<viaRoutes.length; i++)
	{
		System.out.println(viaRoutes[i]);
	}
	
	System.out.println(System.lineSeparator());
	System.out.println("Crossing Trains");
	System.out.println("====================");
	for(int i=0; i<crossingTrains.length; i++)
	{
		System.out.println(crossingTrains[i]);
	}
	
	
	System.out.println(System.lineSeparator());
	System.out.println("Platform No In Junctions");
	System.out.println("====================");
	for(int i=0; i<platformNoInJunctions.length; i++)
	{
		System.out.println(platformNoInJunctions[i]);
	}
	
	
	System.out.println(System.lineSeparator());
	System.out.println("Tiffan In Train");
	System.out.println("====================");
	for(int i=0; i<tiffanInTrain.length; i++)
	{
		System.out.println(tiffanInTrain[i]);
	}
	
	
	System.out.println(System.lineSeparator());
	System.out.println("Snacks In Train");
	System.out.println("====================");
	for(int i=0; i<snacksInTrain.length; i++)
	{
		System.out.println(snacksInTrain[i]);
	}
	
	
	System.out.println(System.lineSeparator());
	System.out.println("Coach Numbers");
	System.out.println("====================");
	for(int i=0; i<coachNumbers.length; i++)
	{
		System.out.println(coachNumbers[i]);
	}
	
	}

}

