package com.xworkz.firstAidKit.repo;

import org.springframework.stereotype.Component;

import com.xworkz.firstAidKit.dto.ResortDto;

@Component
public class ResortRepositoryImpl implements ResortRepository {

	public ResortRepositoryImpl() {

		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean save(ResortDto dto) {

		System.out.println("save method started");
		System.out.println("resort dto passed : " + dto);
		System.out.println("save method ended");

		return true;
	}

}
