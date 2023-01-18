package com.xworkz.Soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.Soldier.dto.SoldierDTO;
import com.xworkz.Soldier.repo.SoldierReository;

public class SoldirServiceImple implements SoldierService {

	public SoldierReository repository;

	public SoldirServiceImple() {

		System.out.println("SoldirServiceImple no-args const....");
	}

	public void setSoldierRepository(SoldierReository repository) {
		this.repository = repository;
	}

	@Override
	public boolean containAndValidation(SoldierDTO dto) {

		System.out.println("containAndValidation method is started..");
		System.out.println("DTO passed :"+dto);
		
		ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violation = validator.validate(dto);
		if(!violation.isEmpty())
		{
			System.err.println("There is a Error..!!!!!!!");
			violation.forEach(v->System.err.println(v.getMessage()));
		      return false;
		}
		else
		{
			System.out.println("data is valid..");
			boolean  saved= repository.save(dto);
			System.out.println("dto is saved using repository :"+saved);
			return saved;
		}
		
	}

}
