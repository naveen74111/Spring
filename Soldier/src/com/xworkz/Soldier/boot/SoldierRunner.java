package com.xworkz.Soldier.boot;

import com.xworkz.Soldier.dto.SoldierDTO;
import com.xworkz.Soldier.repo.SoldierRepositoryImple;
import com.xworkz.Soldier.service.SoldirServiceImple;

public class SoldierRunner {

	public static void main(String[] args) {

		SoldierDTO dto1 = new SoldierDTO("Naveen", 1, 23, "1strank","india", "leader"); 
		
		SoldierDTO dto2 = new SoldierDTO("kumar", 2, 23, "2strank","ukrain", "leader"); 
		
		SoldirServiceImple service =new SoldirServiceImple();	
		
	    SoldierRepositoryImple repository =new SoldierRepositoryImple();
		service.setSoldierRepository(repository);
        service.containAndValidation(dto1);
        
        
        SoldierRepositoryImple repository1 =new SoldierRepositoryImple();
		service.setSoldierRepository(repository1);
		service.containAndValidation(dto2);

		
        
        
		
		
	
	}

}
