package com.xworkz.spring.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class AutowiredConfiguration {

	@Bean
	public int id() {
		System.out.println("Registering Id..");
		return 213156;
	}
	
	@Bean
	public String name() {
		System.out.println("Registring String Of Name..");
		return "Laksmi Hardware Shop";
	}
	
	@Bean
	public String gstNum() {
		System.out.println("Registring GST No .....");
		String num=new String("546523kaj5656");
		return num;
	}
	
	@Bean
	public String ownerName() {
		System.out.println("Registring Owner Name..");
		String str="Naveen";
		return str;
	}
	
	@Bean
	public String address() {
		System.out.println("Registring Address...");
		return "rajaji nagar, banglore";
		}
	
	@Bean
	public String softwareName() {
		System.out.println("Software Name Registring");
		return "Eclipse";
	}
	
	@Bean
	public double softwareVersion() {
		System.out.println("Software Version");
		return 1.8;
	}
	
	@Bean
	public String developerName() {
		System.out.println("Register Developer Name");
		String str= new String("Naveen");
		return str;
	}
	
	@Bean
	public LocalDate date() {
		System.out.println("Software Register Date");
		LocalDate date= LocalDate.now();
		return date;
	}
	
	@Bean
	public boolean free() {
		System.out.println("Software is Free or Not");
		return true;
	}
	
	@Bean
	public String engineerName() {
		return "Naveen";
	}
	
	@Bean
	public int salary() {
		return 33000;
	}
	
	@Bean
	public String companyName() {
		String name=new String("tech solution pvt.ltd");
		return name;
	}
	
	@Bean
	public int experience() {
		int exper=1;
		return exper;
	}
	
	@Bean
	public String pencilName() {
		return "Nataraj";
	}
	
	@Bean
	public String pencilType() {
		return "Color Pencil";
	}
	
	@Bean
	public int pencilPrice() {
		return 5;
	}
	
	@Bean
	public String pencilColor() {
		return "Red";
	}
	
	@Bean
	public boolean pencilSharp() {
		return true;
	}
	
	@Bean
	public boolean stolen() {
		return false;
	}
	
	@Bean
	public String rubberName() {
		return "Nataraj Rubber";
	}
	
	@Bean
	public String rubberType() {
		return "Synthetic Rubber";
	}
	
	@Bean
	public int rubberPrice() {
		return 5;
	}
	
	@Bean
	public String rubberColor() {
		return "White,yellow";
	}
	
	@Bean
	public boolean rubberSharp() {
		return false;
	}
	
	@Bean
	public boolean rubberStolen() {
		return false;
	}
	
	@Bean 
	public int rubberSize() {
		return 2;
	}
}
