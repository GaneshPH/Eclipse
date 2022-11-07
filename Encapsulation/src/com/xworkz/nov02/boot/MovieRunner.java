package com.xworkz.nov02.boot;

import com.xworkz.nov02.Movie;
import com.xworkz.nov02.MovieAccessClass;

public class MovieRunner {
	
	public static void main(String[] args) {
		Movie movie= new Movie("KGF 2", "Prashanth Neel", "Yash", "Shrinidhi Shetty", "Vijay Kiragandur", "Sanjay", "14/04/2022", "kannada", true);
		MovieAccessClass kgf= new MovieAccessClass();
		movie.showoff();
		kgf.useMovie(movie);
		
	}

}
