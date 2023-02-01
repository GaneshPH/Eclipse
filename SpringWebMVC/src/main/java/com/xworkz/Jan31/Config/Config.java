package com.xworkz.Jan31.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Jan31")
public class Config {
	public Config() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

}
