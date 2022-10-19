package com.xworkz.copy.oct18.boot;

public class Movie {
	public String[] name;
	public double[] rating;
	public String[] budget;
	public String[] hero;
	public String[] heroine;
	public String[] villan;
	public boolean movieIsGood;
	public String language;
	public int releasedInTotalTheatre;
	public boolean noLoss;
	
	
	public Movie(String[] name, double[] rating, String[] budget, String[] hero, String[] heroine, String[] villan,
			boolean movieIsGood, String language, int releasedInTotalTheatre, boolean noLoss) 
	{
		this.name = name;
		this.rating = rating;
		this.budget = budget;
		this.hero = hero;
		this.heroine = heroine;
		this.villan = villan;
		this.movieIsGood = movieIsGood;
		this.language = language;
		this.releasedInTotalTheatre = releasedInTotalTheatre;
		this.noLoss = noLoss;
	}
	
	public void display()
	{
		System.out.println(this.movieIsGood);
		System.out.println(this.language);
		System.out.println(this.releasedInTotalTheatre);
		System.out.println(this.noLoss);
		
		System.out.println(System.lineSeparator());
		System.out.println("name");
		System.out.println("====================");
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("rating");
		System.out.println("====================");
		for(int i=0; i<rating.length; i++)
		{
			System.out.println(rating[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("budget");
		System.out.println("====================");
		for(int i=0; i<budget.length; i++)
		{
			System.out.println(budget[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("hero");
		System.out.println("====================");
		for(int i=0; i<hero.length; i++)
		{
			System.out.println(hero[i]);
		}
		
		
		System.out.println(System.lineSeparator());
		System.out.println("heroine");
		System.out.println("====================");
		for(int i=0; i<heroine.length; i++)
		{
			System.out.println(heroine[i]);
		}
		
		
		
		System.out.println(System.lineSeparator());
		System.out.println("villan");
		System.out.println("====================");
		for(int i=0; i<villan.length; i++)
		{
			System.out.println(villan[i]);
		}
	
	}
}
