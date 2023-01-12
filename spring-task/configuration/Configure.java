package com.xworkz.spring3.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring3")
public class Configure {


	@Bean
	public String bikeName() {
		return "Pulsur-150";
	}
	
	@Bean
	public int bikeCC() {
		return 150;
	}
	
	@Bean
	public int bikePrice() {
		return 90000;
	}
	
	@Bean
	public String bikeColor() {
		return "Black";
	}
	
	@Bean
	public int bikeWheels() {
		return 2;
	}
	
	@Bean
	public String bikeBrand() {
		return "Bajaj";
	}
	
	@Bean 
	public int newsPaperId() {
		return 1234;
	}
	
	@Bean
	public String newsPaperName() {
		return "Vijay-Vani";
	}
	
	@Bean
	public String newsPaperOwnerName() {
		return "Vijay shankar";
	}
	
	@Bean
	public String newsPaperLanguage() {
		return "Kannada";
	}
	
	@Bean
	public double newsPaperPrice() {
		return 4.5;
	}
	
	@Bean
	public String engineName() {
		return "AudiQ9";
	}
	
	@Bean
	public String engineType() {
		return "Petrol";
	}
	
	@Bean
	public int engineNumber() {
		return 988516;
	}
	
	@Bean
	public String engineVersion() {
		return "BS8";
	}
	
	@Bean
	public String engineCompanyName() {
		return "Audi";
	}
	
	@Bean
	public int engineStroke() {
		return 4;
	}
	
	@Bean
	public String snakeName() {
		return "King Cobra";
	}
	
	@Bean
	public int snakeLength() {
		return 5;
	}
	
	@Bean
	public String snakeColor() {
		return "Brown";
	}
	
	@Bean
	public String snakeType() {
		return "Dangerous Snake";
	}
	
	@Bean
	public boolean snakePoisionous() {
		return true;
	}
	
	@Bean 
	public String ghostName() {
		return "Unknown";
	}
	
	@Bean 
	public String ghostFatherName() {
		return "Daddy";
	}
	
	@Bean 
	public String ghostMotherName() {
		return "Moms";
	}
	
	@Bean 
	public String ghostJob() {
		return "Software Engineer";
	}
	
	@Bean 
	public String ghostGender() {
		return "Male";
	}
	
	@Bean 
	public String ghostDressColor() {
		return "Yellow";
	}
	
	@Bean 
	public LocalDate dateOfDeath() {
		LocalDate date=LocalDate.of(2022, 02, 01);
		return date;
	}
	
	@Bean 
	public String ghostDeathPlace() {
		return " PK Halli";
	}
	
	@Bean 
	public String ghostBirthPlace() {
		return "Marata Halli";
	}
	
	@Bean 
	public String ghostGirlFriendName() {
		return "rachita";
	}
	
	@Bean 
	public boolean ghostMarried() {
		return true;
	}
	
	@Bean 
	public boolean ghostEmploye() {
		return true;
	}
	
	@Bean 
	public boolean ghostNail() {
		return true;
	}
	
	@Bean 
	public boolean ghostSingle() {
		return true;
	}
	
	@Bean 
	public boolean ghostVisible() {
		return false;
	}
	
	@Bean 
	public boolean ghostHands() {
		return true;
	}
	
	@Bean 
	public boolean ghostLegs() {
		return false;
	}
	
	@Bean 
	public boolean ghostRelationShip() {
		return true;
	}
	
	@Bean 
	public int ghostNailLength() {
		return 5;
	}
	
	@Bean 
	public int ghostAge() {
		return 50;
	}
}
