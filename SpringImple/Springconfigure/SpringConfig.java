package com.xworkz.spring.Springconfigure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.classes.Actor;
import com.xworkz.spring.classes.Rocket;
import com.xworkz.spring.classes.Season;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfig {

	@Bean
	public Rocket rock() {
		System.out.println("Rocket registering withspring...");
		Rocket rock = new Rocket();
		rock.getName();
		rock.getCountry();
		rock.getBudget();
		return rock;
	}

	@Bean
	public Actor acting() {
		
		Actor actor =new Actor("PuneethRajkumar", "Kannada", 45);
		actor.getName();
		actor.getLanguage();
		actor.getAge();
		return actor;
	}
	
	@Bean
	public Season sessson()
	{
		Season se= new Season();
		se.setName("winter");
		se.getName();
		se.setDuration("3 month");
		se.getDuration();
		se.setStartingMonth("jun");
		se.getStartingMonth();
		return se;
	}
}
