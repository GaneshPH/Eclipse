package com.Xworkz.Spring.Autowired.Bean;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	private String name;
	@Value("5")
	private double length;
	@Value("Golden")
	private String color;
	private String type;
	private boolean poisonous;
	
	public Snake(@Qualifier("nameOfSnake")String name, @Qualifier("typeOfSnake")String type,
					@Qualifier("isItPoisonous") boolean poisonous ) {
		super();
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisonous="
				+ poisonous + "]";
	}
	
}
