package com.xworkz.Spring.classes;

import org.springframework.stereotype.Component;

@Component
public class SprinDouble {

	public Double rate()
	{
		System.out.println("Rate is registered with spring..");
		Double ref =new Double(15.8);
		return ref;
	}
	public  Double hotelIdli() {
		System.out.println("Hotel is registered with spring..");
	return 30.00;
	}
	public Double laptop() {
		System.out.println("laptop is registerd with spring..");
		return 45000.00;
	}
}
