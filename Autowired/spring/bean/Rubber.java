package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {

	@Autowired
	@Qualifier("rubberName")
	private String name;

	@Autowired
	@Qualifier("rubberType")
	private String type;

	@Autowired
	@Qualifier("rubberPrice")
	private int price;

	@Autowired
	@Qualifier("rubberColor")
	private String color;

	@Autowired
	@Qualifier("rubberSharp")
	private boolean sharp;

	@Autowired
	@Qualifier("rubberStolen")
	private boolean stolen;

	@Autowired
	@Qualifier("rubberSize")
	private int size;

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}
	
	
}
