package com.xworkz.firstAidKit.repo;

import org.springframework.stereotype.Component;

import com.xworkz.firstAidKit.dto.MissileDto;

@Component
public class MissileRepoImpl implements MissileRepository {

	public MissileRepoImpl() {
		System.out.println("MissileRepoImpl const with no arugms....");
	}

	@Override
	public boolean save(MissileDto missileDto) {
		
		System.out.println("save method started");
		System.out.println("missile dto passed : " +missileDto );
		
		System.out.println("save method started");

		return true;
	}
}
