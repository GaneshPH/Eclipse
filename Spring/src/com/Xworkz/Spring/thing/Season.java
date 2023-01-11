package com.Xworkz.Spring.thing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Tuesday")
public class Season {
	private String name;
	private double duration;
	private String startingMonth;

	public Season() {
		System.out.println("Season Running");
	}

	public String getName() {
		return name;
	}

	@Value("Summer")
	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return duration;
	}

	@Value("4")
	public void setDuration(double duration) {
		this.duration = duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("January")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

}
