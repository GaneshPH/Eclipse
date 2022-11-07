package com.xworkz.nov02;

public class Movie {
	
	public String name;
	public String director;
	public String hero;
	public String heroine;
	public String producer;
	public String villan;
	private String shootingLocation;
	private String budget;
	public String realesedate;
	public String language;
	public boolean goodMovie;
	
	
	public Movie(String name, String director, String hero, String heroine, String producer, String villan,
			String realesedate, String language, boolean goodMovie) {
		super();
		this.name = name;
		this.director = director;
		this.hero = hero;
		this.heroine = heroine;
		this.producer = producer;
		this.villan = villan;
		this.realesedate = realesedate;
		this.language = language;
		this.goodMovie = goodMovie;
	}


	public String getShootingLocation() {
		return shootingLocation;
	}


	public void setShootingLocation(String shootingLocation) {
		this.shootingLocation = shootingLocation;
	}


	public String getBudget() {
		return budget;
	}


	public void setBudget(String budget) {
		this.budget = budget;
	}
	
	public void showoff() {
		System.out.println("Name: "+this.name);
		System.out.println("director: "+this.director);
		System.out.println("hero: "+this.hero);
		System.out.println("heroine: "+this.heroine);
		System.out.println("producer: "+this.producer);
		System.out.println("villan: "+this.villan);
		System.out.println("realesedate: "+this.realesedate);
		System.out.println("language: "+this.language);
		System.out.println("goodMovie: "+this.goodMovie);
		
	}
	
	
	
	

}
