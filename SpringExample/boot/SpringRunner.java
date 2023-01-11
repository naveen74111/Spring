package com.xworkz.Spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Spring.classes.SprinDouble;
import com.xworkz.Spring.classes.SpringBoolean;
import com.xworkz.Spring.classes.SpringBuffer;
import com.xworkz.Spring.classes.SpringList;
import com.xworkz.Spring.classes.SpringMap;
import com.xworkz.Spring.classes.SpringString;
import com.xworkz.Spring.classes.SpringStringBuilder;

public class SpringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----------------------String------------------------");
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringString.class);
	
		System.out.println("----------------------Boolean------------------------");		
		ApplicationContext spring1 =new AnnotationConfigApplicationContext(SpringBoolean.class);
			SpringBoolean ref =spring1.getBean(SpringBoolean.class);
			System.out.println(ref.fees());
			System.out.println(ref.getString());
			System.out.println(ref.banglore());
			System.out.println(ref.eclipse());
		
		System.out.println("----------------------Double------------------------");		

		ApplicationContext spring2 = new AnnotationConfigApplicationContext(SprinDouble.class);
			SprinDouble ref1 = spring2.getBean(SprinDouble.class);
			System.out.println(ref1.rate());
			System.out.println(ref1.laptop());
			System.out.println(ref1.hotelIdli());
	
		System.out.println("----------------------ArrayList------------------------");		
		
		ApplicationContext spring3 =new AnnotationConfigApplicationContext(SpringList.class);

		System.out.println("----------------------HashMap------------------------");		
		ApplicationContext spring4 =new AnnotationConfigApplicationContext(SpringMap.class);
	
		System.out.println("----------------------StringBuffer------------------------");		
		
		ApplicationContext spring5 =new AnnotationConfigApplicationContext(SpringBuffer.class);
		SpringBuffer buffer = spring5.getBean(SpringBuffer.class);
		System.out.println(buffer.getString());
		System.out.println(buffer.check());
		System.out.println(buffer.name());
		System.out.println(buffer.ref());

		System.out.println("----------------------StringBuffer------------------------");		
		ApplicationContext spring6 =new AnnotationConfigApplicationContext(SpringStringBuilder.class);
		SpringStringBuilder bd=spring6.getBean(SpringStringBuilder.class);
	     System.out.println(bd.getString());
	     System.out.println(bd.name());
	}


}
