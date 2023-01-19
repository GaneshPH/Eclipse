package com.Xworkz.Spring.Autowired.custom;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MovieRunner {
	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(Config.class);

		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));
		
		Movie mov=container.getBean(Movie.class);
		System.out.println(mov);
	}

}
