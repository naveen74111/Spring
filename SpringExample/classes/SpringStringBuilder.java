package com.xworkz.Spring.classes;

import org.springframework.stereotype.Component;

@Component
public class SpringStringBuilder {

	public  StringBuilder getString() {
		StringBuilder bd =new StringBuilder("BashyamCircle Banglore");
		System.out.println(bd.charAt(7));
		return bd;
	}
	public StringBuilder name()
	{
		StringBuilder bd=new StringBuilder("xworkz");
		
		System.out.println(bd.substring(3));
		return bd;
	}

}
