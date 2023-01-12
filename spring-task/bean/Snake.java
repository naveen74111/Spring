package com.xworkz.spring3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {

private String name;
	
	@Autowired
	@Qualifier("snakeLength")
	private int length;
	
	@Autowired
	@Qualifier("snakeColor")
	private String color;
	
	private String type;
	
	private boolean poisionus;

	public Snake(@Qualifier("snakeName") String name,@Qualifier("snakeType") String type,@Qualifier("snakePoisionous") boolean poisionus) {
		super();
		this.name = name;
		this.type = type;
		this.poisionus = poisionus;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisionus="
				+ poisionus + "]";
	}

}
