package com.xworkz.FoodItems.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.FoodItems")
public class FoodItemConfig {
	public FoodItemConfig() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
