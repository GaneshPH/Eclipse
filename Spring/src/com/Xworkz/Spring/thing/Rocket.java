package com.Xworkz.Spring.thing;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Value;

@Component("Jan10")
public class Rocket {
	@Value("India")
	private String country;
	@Value("PSLV")
	private String name;
	@Value("130")
	private double budget;

	public Rocket() {
		System.out.println("Running Rocket");

	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}

}
