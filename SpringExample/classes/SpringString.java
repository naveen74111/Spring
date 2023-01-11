package com.xworkz.Spring.classes;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringString {

	@Bean
	public String city() {
		System.out.println("Ballari is registered with Spring....");
		String str = new String();
		return str;
	}
	@Bean
	public String Hospital() {
		System.out.println("Hospital is registered with spring..");
		String str2= new String();
		return str2;
	}
	
	@Bean
	public String theater() {
		System.out.println("Navarang theater is registerd with spring...");
		String thetre= new String();
		return thetre;
	}
	@Bean
	public String Movie()
	{
		System.out.println("movie is registered with spring..");
		String strr=new String();
		return strr;
	}
	@Bean
	public String megaStar() {
		System.out.println("MegaStar movie is registered with spring..");
		String st =new String();
		return st;
	} 
	@Bean
	public String mall() {
		System.out.println("Orian Mall is registerd with spring..");
		String mall =new String();
		return mall;
	}

}
