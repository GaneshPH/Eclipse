package com.xworkz.nov02;

public class MovieAccessClass {
	
	public Movie movie;
	public void useMovie(Movie movie) {
		
		movie.setBudget("125CR");
		System.out.println("Budget: "+movie.getBudget());
		
		movie.setShootingLocation("Bengaluru, KGF");
		System.out.println("Shooting Location: "+movie.getShootingLocation());
	}
	

}
