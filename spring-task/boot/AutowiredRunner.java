package com.xworkz.spring3.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring3.bean.Engine;
import com.xworkz.spring3.bean.Ghost;
import com.xworkz.spring3.bean.NewsPaper;
import com.xworkz.spring3.bean.Snake;
import com.xworkz.spring3.configuration.Configure;

public class AutowiredRunner {

	public static void main(String[] args) {
		
ApplicationContext container= new AnnotationConfigApplicationContext(Configure.class);
		
		String[] names=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(names));
		
System.out.println("=======================================");
		
		Engine bike=container.getBean(Engine.class);
		System.out.println(bike);
		System.out.println(container.getBean("bikeName"));
		System.out.println(container.getBean("bikeCC"));
		System.out.println(container.getBean("bikePrice"));
		System.out.println(container.getBean("bikeWheels"));
		System.out.println(container.getBean("bikeBrand"));
		System.out.println(container.getBean("bikeColor"));
		
		System.out.println("=====================================");
		
		NewsPaper paper=container.getBean(NewsPaper.class);
		System.out.println(paper);
		
		System.out.println("=========================================");
		
		Engine engine=container.getBean(Engine.class);
		System.out.println(engine);
		
		System.out.println("==================================");
		
		Snake snake=container.getBean(Snake.class);
		System.out.println(snake);
		
		System.out.println("=======================================");
		
		Ghost ghost=container.getBean(Ghost.class);
		System.out.println(ghost);
		
	}
}
