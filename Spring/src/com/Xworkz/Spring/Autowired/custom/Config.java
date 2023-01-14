package com.Xworkz.Spring.Autowired.custom;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.Xworkz.Spring.Autowired.custom")
public class Config {
	public Config() {
		System.out.println("Created CustomConfiguration using default constructor");
	}

}
