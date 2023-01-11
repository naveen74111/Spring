package com.xworkz.Spring.classes;

import org.springframework.stereotype.Component;

@Component
public class SpringBoolean {

	
	public Boolean fees() {
		System.out.println("Fees is paid...");
		boolean isPaidFees = true;
		return isPaidFees;
	}
	public Boolean getString() {
		System.out.println("Ballari is a StealCity");
		return true;
	}
	public Boolean banglore() {
		System.out.println("Banglore is a SiliconCity");
		return true;
	}
	
	public Boolean eclipse() {
		System.out.println("Eclipse ia editor application for java");
        return true;
	}
}
