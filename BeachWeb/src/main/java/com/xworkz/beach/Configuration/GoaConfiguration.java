package com.xworkz.beach.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.beach")
public class GoaConfiguration {
	public GoaConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

}
