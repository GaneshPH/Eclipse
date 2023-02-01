package com.xworkz.Jan31.component;

import org.springframework.stereotype.Component;

@Component
public class Demo {

	public Demo() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

}
