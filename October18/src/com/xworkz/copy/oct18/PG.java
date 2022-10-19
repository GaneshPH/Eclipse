package com.xworkz.copy.oct18;

public class PG {
	public String name;
	public String location;
	public int floorsInPG;
	public boolean boys;
	public String[] breakfastInPg;
	public String[] lunchInPg;
	public String[] dinnerInPg;
	public String[] roomatesName;
	public String[] roomNoIn1Floor;
	public String[] facilities;
	
	public PG(String name, String location, int floorsInPG, boolean boys, String[] breakfastInPg, String[] lunchInPg,
			String[] dinnerInPg, String[] roomatesName, String[] roomNoIn1Floor, String[] facilities) 
	{
		this.name = name;
		this.location = location;
		this.floorsInPG = floorsInPG;
		this.boys = boys;
		this.breakfastInPg = breakfastInPg;
		this.lunchInPg = lunchInPg;
		this.dinnerInPg = dinnerInPg;
		this.roomatesName = roomatesName;
		this.roomNoIn1Floor = roomNoIn1Floor;
		this.facilities = facilities;
	}
		public void display()
		{
			System.out.println(this.name);
			System.out.println(this.location);
			System.out.println(this.floorsInPG);
			System.out.println(this.boys);
			
			System.out.println(System.lineSeparator());
			System.out.println("breakfast In Pg");
			System.out.println("====================");
			for(int i=0; i<breakfastInPg.length; i++)
			{
				System.out.println(breakfastInPg[i]);
			}
			
			System.out.println(System.lineSeparator());
			System.out.println("lunch In Pg");
			System.out.println("====================");
			for(int i=0; i<lunchInPg.length; i++)
			{
				System.out.println(lunchInPg[i]);
			}
			
			
			System.out.println(System.lineSeparator());
			System.out.println("dinner In Pg");
			System.out.println("====================");
			for(int i=0; i<dinnerInPg.length; i++)
			{
				System.out.println(dinnerInPg[i]);
			}
			
			
			System.out.println(System.lineSeparator());
			System.out.println("roomatesName");
			System.out.println("====================");
			for(int i=0; i<roomatesName.length; i++)
			{
				System.out.println(roomatesName[i]);
			}
			
			
			System.out.println(System.lineSeparator());
			System.out.println("roomNo In 1Floor");
			System.out.println("====================");
			for(int i=0; i<roomNoIn1Floor.length; i++)
			{
				System.out.println(roomNoIn1Floor[i]);
			}
			
			
			
			System.out.println(System.lineSeparator());
			System.out.println("facilities");
			System.out.println("====================");
			for(int i=0; i<facilities.length; i++)
			{
				System.out.println(facilities[i]);
			}
			
		
	}
	
	

}
