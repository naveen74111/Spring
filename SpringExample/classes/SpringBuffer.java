package com.xworkz.Spring.classes;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SpringBuffer {

	@Bean
	public StringBuffer getString() {
		StringBuffer buffer= new StringBuffer("Banglore");
		return buffer;
	}
	
	@Bean
	public StringBuffer check()
	{
		StringBuffer buffer=new StringBuffer("hi,hello");
		buffer.append(" Good Morning");
		return buffer;
	}
	
	
	public StringBuffer name()
	{
		StringBuffer buffer=new StringBuffer("D-Mart");
		System.out.println("str length : " +buffer.length());
		return buffer;
	}
	
	public StringBuffer ref()
	{
		StringBuffer buffer=new StringBuffer("Kiran");
		buffer.reverse();
		return buffer;
	}
	
}
