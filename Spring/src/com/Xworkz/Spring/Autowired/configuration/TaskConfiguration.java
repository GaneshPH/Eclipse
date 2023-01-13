package com.Xworkz.Spring.Autowired.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.xworkz.Spring.Autowired")
public class TaskConfiguration {
	@Bean
	public String nameOfNewsPaper() {
		return "vijayavani";
	}
	@Bean
	public String ownerNameOfNewsPaper() {
		return "Vijay Sankeshwar";
	}
	

	@Bean
	public String nameOfEngine() {
		return "Ford 5L Coyote Crate ";
	}
	
	@Bean
	public String typeofEngine() {
		return " 4Stroke";
	}
	
	@Bean
	public String companyName() {
		return "Ford" ;
	}

	
	@Bean
	public String nameOfSnake() {
		return "Cobra";
	}
	
	@Bean
	public String typeOfSnake () {
		return "Elapid Snake";
	}
	
	@Bean
	public boolean isItPoisonous() {
		return true;
	}
	
	@Bean("gen")
	public String genderOfGhodt() {
		return "Not Disclosed";
	}
	
	@Bean
	public LocalDate birthDate() {
		return LocalDate.of(2022, 12, 31);
	}
	
	@Bean
	public LocalDate deathDate() {
		return LocalDate.of(2023, 1, 1);
	}
	
	@Bean
	public String deathReason() {
		return "Sumne";
	}
	
	@Bean
	public boolean  realOrFake() {
		return false;
	}
	
	@Bean
	public String name()
	{
		
		return "Horror";
	}
	
	@Bean
	public String area() {
		return "movie";
	}
	
	@Bean
	public String location() {
		return "allFilmIndustry";
	}
	@Bean
	public String nativeLocation() {
		return "filmIndustry";
	}
	
	@Bean("pin")
	public int areaPincode() {
		return 123456;
	}

}
