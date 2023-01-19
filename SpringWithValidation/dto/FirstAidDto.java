package com.xworkz.firstAidKit.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class FirstAidDto extends AbstractAuditDto {

	@NotBlank
	@NotBlank
	@Size(min = 3, max = 20, message = "Name Should be greater then 3 and lesser than 20")
	private String name;

	@Min(value = 1, message = "Id Should be grater than 0")
	@Max(value = 10, message = "it should be lesser then 10")
	private int id;

	@Min(value = 18, message = "age should be grater than 18")
	@Max(value = 35, message = "age should be lesser than 35")
	private int age;

}
