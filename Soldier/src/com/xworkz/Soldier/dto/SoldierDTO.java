package com.xworkz.Soldier.dto;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO {

	@NotNull
	@NotBlank
	@Size(min = 3,max=20, message="Name Should be greater then 3 and lesser than 20")
	private String name;
	
	@Min(value=1,message="Id Should be grater than 0")
	@Max(value=10, message="it should be lesser then 10")
	private int id;
	
	@Min(value=18,message="age should be grater than 18")
	@Max(value=35,message="age should be lesser than 35")
	private int age;
	
	@NotNull
	@NotBlank
	@Size(min=3,max=10, message="rank should be min is 3 max is 10")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min=3,max=30,message="battalian should be min is 3 and max is 30")
	private String battalian;
	@NotNull
	@NotBlank
	@Size(min=4,max=20,message="country shuold be min is 4 and max is 20")
	private String country;
	
	
}
