package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.Springconfigure.SpringConfig;
import com.xworkz.spring.classes.Actor;
import com.xworkz.spring.classes.Rocket;
import com.xworkz.spring.classes.Season;

public class SpringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig.class);

		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));

		Rocket rocket = spring.getBean("rocket", Rocket.class);
		System.out.println(rocket);

		System.out.println(rocket.getName());
		System.out.println(rocket.getCountry());
		System.out.println(rocket.getBudget());

		Rocket rocket1 = spring.getBean("rock", Rocket.class);
		System.out.println(rocket1);
		System.out.println(rocket1.getName());
		System.out.println(rocket1.getCountry());
		System.out.println(rocket1.getBudget());

		Actor actor = spring.getBean("actor", Actor.class);
		System.out.println(actor);
		System.out.println(actor.getName());
		System.out.println(actor.getLanguage());
		System.out.println(actor.getAge());

		Season seson = spring.getBean("season", Season.class);
		System.out.println(seson);
		System.out.println(seson.getName());
		System.out.println(seson.getDuration());
		System.out.println(seson.getStartingMonth());

		Season seson1 = spring.getBean("sessson", Season.class);
		System.out.println(seson1);
		System.out.println(seson1.getName());
		System.out.println(seson1.getDuration());
		System.out.println(seson1.getStartingMonth());

	}

}
