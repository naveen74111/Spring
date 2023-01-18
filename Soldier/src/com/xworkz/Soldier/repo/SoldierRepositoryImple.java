package com.xworkz.Soldier.repo;

import com.xworkz.Soldier.dto.SoldierDTO;

public class SoldierRepositoryImple implements SoldierReository {

	public SoldierRepositoryImple() {
		System.out.println("SoldierRepositoryImple no-args const...");
	}

	@Override
	public boolean save(SoldierDTO dto) {

		System.out.println("save method started....");
		System.out.println("dto passed : "+dto);
		return true;
	}
}
