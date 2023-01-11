package com.Xworkz.Spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Xworkz.Spring.configuration.Config10;
import com.Xworkz.Spring.thing.Actor;
import com.Xworkz.Spring.thing.Rocket;
import com.Xworkz.Spring.thing.Season;

public class ACRRunner {
	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(Config10.class);
		Rocket refRocket = spring.getBean("Jan10", Rocket.class);
		System.out.println(refRocket.toString());
		System.out.println(refRocket.getCountry());
		System.out.println(refRocket.getName());
		System.out.println(refRocket.getBudget());

		Rocket refRocket1 = spring.getBean("Rocky",Rocket.class);
		System.out.println(refRocket1.getCountry());
		System.out.println(refRocket1.getName());
		System.out.println(refRocket1.getBudget());

		Actor refActor = spring.getBean("Appu", Actor.class);
		System.out.println(refActor.getName());
		System.out.println(refActor.getLanguage());
		System.out.println(refActor.getAge());

		Actor refActor1 = spring.getBean("hero", Actor.class);
		System.out.println(refActor1.getName());
		System.out.println(refActor1.getLanguage());
		System.out.println(refActor1.getAge());

		Season refSeason = spring.getBean("Tuesday", Season.class);
		System.out.println(refSeason.getName());
		System.out.println(refSeason.getDuration());
		System.out.println(refSeason.getStartingMonth());

		Season refSeason1 = spring.getBean("cold", Season.class);
		System.out.println(refSeason1.getName());
		System.out.println(refSeason1.getDuration());
		System.out.println(refSeason1.getStartingMonth());

	}
}
