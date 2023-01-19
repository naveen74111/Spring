package com.xworkz.firstAidKit.repo;

import org.springframework.stereotype.Component;

import com.xworkz.firstAidKit.dto.FirstAidDto;

@Component
public class FirstAidRepoImple implements FirstAidRepo {

	public FirstAidRepoImple() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(FirstAidDto firstAidDto) {
		System.out.println("Running save.........");
		System.out.println("Dto" + firstAidDto);
		return true;
	}

}
