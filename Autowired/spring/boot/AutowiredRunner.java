package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.bean.HardwareShop;
import com.xworkz.spring.bean.Pencil;
import com.xworkz.spring.bean.Rubber;
import com.xworkz.spring.bean.Software;
import com.xworkz.spring.bean.SoftwareEngineer;
import com.xworkz.spring.configuration.AutowiredConfiguration;

public class AutowiredRunner {

	public static void main(String[] args) {

ApplicationContext container= new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
		
		String[] names=container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(names));
		
		HardwareShop shop=container.getBean(HardwareShop.class);
		System.out.println(shop);
		
		int ids=container.getBean("id",int.class);
		System.out.println(ids);
		String str=container.getBean("name",String.class);
		System.out.println(str);
		String gst=container.getBean("gstNum",String.class);
		System.out.println(gst);
		String string=container.getBean("ownerName",String.class);
		System.out.println(string);
		Object adrs=container.getBean("address");
		System.out.println(adrs);
		
		System.out.println("===============================================");
		
		Software soft=container.getBean(Software.class);
		System.out.println(soft);
		System.out.println(container.getBean("softwareName"));
		System.out.println(container.getBean("softwareVersion"));
		System.out.println(container.getBean("developerName"));
		System.out.println(container.getBean("date"));
		System.out.println(container.getBean("free"));
		
		System.out.println("=========================================");
		
		SoftwareEngineer engineer=container.getBean(SoftwareEngineer.class);
		System.out.println(engineer);
		System.out.println(container.getBean("engineerName"));
		System.out.println(container.getBean("salary"));
		System.out.println(container.getBean("companyName"));
		System.out.println(container.getBean("experience"));
		
		System.out.println("=============================================");
		Pencil pencil=container.getBean(Pencil.class);
		System.out.println(pencil);
		System.out.println(container.getBean("pencilName"));
		System.out.println(container.getBean("pencilType"));
		System.out.println(container.getBean("pencilPrice"));
		System.out.println(container.getBean("pencilColor"));
		System.out.println(container.getBean("pencilSharp"));
		System.out.println(container.getBean("stolen"));
		
		System.out.println("=============================================");
		
		Rubber rub=container.getBean(Rubber.class);
		System.out.println(rub);
		System.out.println(container.getBean("rubberName"));
		System.out.println(container.getBean("rubberType"));
		System.out.println(container.getBean("rubberPrice"));
		System.out.println(container.getBean("rubberColor"));
		System.out.println(container.getBean("rubberSharp"));
		System.out.println(container.getBean("rubberStolen"));
		System.out.println(container.getBean("rubberSize"));
	}

}
