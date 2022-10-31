package com.oct28.boot;

import com.oct28.boot.things.City;
import com.oct28.boot.things.Country;
import com.oct28.boot.things.Name;
import com.oct28.boot.things.President;
import com.oct28.boot.things.enumm.GenderName;

public class CountryRunner {

	public static void main(String[] args) {
		
		Country country=new Country("India");
		//
		President president=new President("Draupadi");
		//
		president.setGender(GenderName.MALE);
		//
		country.setPresident(president);
		//
		Name name1=new Name("Bhuvi","Kohli","Iyer");
		City city1=new City(name1, true, 253.36);
		
		Name name2=new Name("Draupadi Marmu", "Paranav", "Prathiba");
		City city2=new City(name2, false, 523.7);
		//
		
		City[] city= {city1,city2};
		country.setCities(city);
		country.display();
		
		
		
			}
}
