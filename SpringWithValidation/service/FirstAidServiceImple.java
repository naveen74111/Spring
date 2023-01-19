package com.xworkz.firstAidKit.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.firstAidKit.dto.FirstAidDto;
import com.xworkz.firstAidKit.repo.FirstAidRepo;

@Component
public class FirstAidServiceImple implements FirstAidService {

	@Autowired
	private Validator validator;// property
	@Autowired
	private FirstAidRepo firstAidRepo;// constructor

	public FirstAidServiceImple() {
		System.out.println("FirstAidServiceImple constr...");
	}

	@Override
	public boolean validateAndSave(FirstAidDto firstAidDto) {
		System.out.println("Running validateAndSave.......");
		System.out.println("aidDto passed" + firstAidDto);

		Set<ConstraintViolation<FirstAidDto>> violation = this.validator.validate(firstAidDto);

		if (!violation.isEmpty()) {
			System.err.println("there arevalidation error...");
			violation.forEach(cv -> System.out.println(cv.getMessage()));
			return false;
		} else {
			System.out.println("Data is valid can save");
			boolean saved = this.firstAidRepo.save(firstAidDto);
			System.out.println("saved firstaid :" + saved);

			return saved;
		}
	}
}
