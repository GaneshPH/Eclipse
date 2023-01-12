package com.Xworkz.Spring.Autowired.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Xworkz.Spring.Autowired.Bean.Engine;
import com.Xworkz.Spring.Autowired.Bean.Ghost;
import com.Xworkz.Spring.Autowired.Bean.NewsPaper;
import com.Xworkz.Spring.Autowired.Bean.Snake;
import com.Xworkz.Spring.Autowired.configuration.TaskConfiguration;

public class AutowiredRunner1 {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TaskConfiguration.class);

		
		System.out.println("======NewsPaper=====");
		NewsPaper news = context.getBean(NewsPaper.class);
		System.out.println(news);

		System.out.println("==========Engine==========");
		Engine eng = context.getBean(Engine.class);
		System.out.println(eng);
		
		System.out.println("===Snake===");
		Snake snake = context.getBean(Snake.class);
		System.out.println(snake);
		
		System.out.println("======Ghost======");
		Ghost ghost = context.getBean(Ghost.class);
		System.out.println(ghost);
	}

}
