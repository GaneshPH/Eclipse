package com.xworkz.copy.oct18.boot;

public class MovieRunner {

	public static void main(String[] args) {
		String[] name= {"kantara", "KGF2", "VR", "LoveMocktail"};
		double[] rating= {9.4, 8.4, 7.3, 8.2};
		String[] budget= {"16CR", "100CR", "95CR", "2CR"}; 
		String[] hero= {"Rishabh Shetty", "Yash", "Suddep", "Krishna"};
	    String[] heroine= {"Sapthami Gowda", "Shreenidhi", "Jacquiline", "Milana"};
		String[] villan= {"Achyuth Kumara", "Achyuth kumara", "Ram", "NoVillan"};
		
		Movie movie = new Movie(name, rating, budget, hero, heroine, villan, true, "kannada", 20000, true);
		movie.display();
	}

}
