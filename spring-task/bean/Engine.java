package com.xworkz.spring3.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;
	private String type;
	
	@Autowired
	@Qualifier("engineNumber")
	private int number;
	
	@Autowired
	@Qualifier("engineVersion")
	private String version;
	
	private String company;
	
	@Autowired
	@Qualifier("engineStroke")
	private int stroke;

	public Engine(@Qualifier("engineName") String name, @Qualifier("engineType") String type, @Qualifier("engineCompanyName") String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", stroke=" + stroke + "]";
	}

}
