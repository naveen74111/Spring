package com.xworkz.firstAidKit.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.firstAidKit.configuration.SpringConfiguration;
import com.xworkz.firstAidKit.dto.FirstAidDto;
import com.xworkz.firstAidKit.dto.MissileDto;
import com.xworkz.firstAidKit.dto.ResortDto;
import com.xworkz.firstAidKit.service.FirstAidService;
import com.xworkz.firstAidKit.service.MissileServices;
import com.xworkz.firstAidKit.service.ResortServices;

public class FirstAidRunner {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(Arrays.toString(container.getBeanDefinitionNames()));

		FirstAidService service = container.getBean(FirstAidService.class);

		boolean saved = service.validateAndSave(new FirstAidDto("Akshar", 5, 30));
		System.out.println("saved" + saved);

		System.out.println(System.lineSeparator());

		MissileServices missile = container.getBean(MissileServices.class);

		boolean saved1 = missile.containsAndValidation(new MissileDto("Nirbhay", "1000 to 1500 Km", "Subsonic Cruise Missile"));
		System.out.println("saved : " + saved1);

		System.out.println(System.lineSeparator());

		ResortServices resort = container.getBean(ResortServices.class);
		boolean b = resort.containsAndValidation(new ResortDto("AmrutaResort", "bellary"));
		System.out.println(b);

	}

}
