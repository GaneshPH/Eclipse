package com.Xworkz.Spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Xworkz.Spring.thing.Actor;
import com.Xworkz.Spring.thing.Rocket;
import com.Xworkz.Spring.thing.Season;



@Configuration
@ComponentScan("com.Xworkz.Spring.thing")
public class Config10 {
	
	
	
	@Bean
	public Rocket Rocky() {
		System.out.println("Registering New Rocket");
		Rocket rocket=new Rocket();
		return rocket;
	}
	
	@Bean
	public Actor hero() {
		System.out.println("Registering new Actor");
		Actor actor=new Actor("Dharshan", "Kannada", 48);
		return actor;
	}
	
	@Bean
	public Season cold() {
		System.out.println("Registering new Season");
		Season season=new Season();
		season.setName("ravi");
		return season;
	}
}