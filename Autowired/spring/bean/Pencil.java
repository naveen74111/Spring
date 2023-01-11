package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {

	@Autowired
	@Qualifier("pencilName")
	private String name;
	
	@Autowired
	@Qualifier("pencilType")
	private String type;
	
	@Autowired
	@Qualifier("pencilPrice")
	private int price;
	
	@Autowired
	@Qualifier("pencilColor")
	private String color;
	
	@Autowired
	@Qualifier("pencilSharp")
	private boolean sharp;
	
	@Autowired
	@Qualifier("stolen")
	private boolean stolen;
	
	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}

	
}
