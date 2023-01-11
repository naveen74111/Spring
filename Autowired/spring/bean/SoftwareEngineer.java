package com.xworkz.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {

	@Autowired
	@Qualifier("engineerName")
	private String name;
	
	@Autowired
	@Qualifier("salary")
	private int salary;
	
	@Autowired
	@Qualifier("companyName")
	private String companyName;
	
	@Autowired
	@Qualifier("experience")
	private int experience;

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ ", experience=" + experience + "]";
	}
	
	
}
