package com.xworkz.flight.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.flight")
public class FlightApplicationConfiguration {

	public FlightApplicationConfiguration() {
		System.out.println("Running FlightApplicationConfiguration");
	}

	@Bean
	public ViewResolver resolver() {
		return new InternalResourceViewResolver("/", ".jsp");

	}

	@Bean

	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		return new LocalContainerEntityManagerFactoryBean();
	}

}
