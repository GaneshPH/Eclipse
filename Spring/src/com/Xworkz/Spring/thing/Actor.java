package com.Xworkz.Spring.thing;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component("Appu")
public class Actor {
	private String name;
	private String language;
	private int age;

	public Actor(@Value("Appu") String name, @Value("Kannada") String language, @Value("46") int age) {
		super();
		this.name = name;
		this.language = language;
		this.age = age;
		System.out.println("Running");
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getLanguage() {
		return language;
	}

}
