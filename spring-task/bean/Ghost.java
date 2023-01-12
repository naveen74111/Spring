package com.xworkz.spring3.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {

private String name;
	
	private String fatherName;
	
	private String motherName;
	
	@Autowired
	@Qualifier("ghostMarried")
	private boolean married;
	
	private String job;
	
	@Autowired
	@Qualifier("ghostEmploye")
	private boolean employe;
	
	@Autowired
	@Qualifier("ghostNailLength")
	private int nailLength;
	
	@Autowired
	@Qualifier("ghostNail")
	private boolean nail;
	
	
	private String gender;
	
	@Autowired
	@Qualifier("ghostSingle")
	private boolean single;
	
	private String dressColor;
	
	@Autowired
	@Qualifier("ghostVisible")
	private boolean visible;
	
	@Autowired
	@Qualifier("ghostAge")
	private int age;
	
	private LocalDate deathDate;
	
	@Autowired
	@Qualifier("ghostHands")
	private boolean hands;
	
	@Autowired
	@Qualifier("ghostLegs")
	private boolean legs;
	
	private String birthPlace;
	
	private String deathPlace;
	
	private String girlFriendname;
	
	@Autowired
	@Qualifier("ghostRelationShip")
	private boolean relationShip;

	public Ghost(@Qualifier("ghostName") String name,@Qualifier("ghostFatherName") String fatherName,@Qualifier("ghostMotherName") String motherName,@Qualifier("ghostJob") String job,@Qualifier("ghostGender") String gender,@Qualifier("ghostDressColor") String dressColor,
			@Qualifier("dateOfDeath") LocalDate deathDate,@Qualifier("ghostBirthPlace") String birthPlace,@Qualifier("ghostDeathPlace") String deathPlace,@Qualifier("ghostGirlFriendName") String girlFriendname) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.job = job;
		this.gender = gender;
		this.dressColor = dressColor;
		this.deathDate = deathDate;
		this.birthPlace = birthPlace;
		this.deathPlace = deathPlace;
		this.girlFriendname = girlFriendname;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", fatherName=" + fatherName + ", motherName=" + motherName + ", married="
				+ married + ", job=" + job + ", employe=" + employe + ", nailLength=" + nailLength + ", nail=" + nail
				+ ", gender=" + gender + ", single=" + single + ", dressColor=" + dressColor + ", visible=" + visible
				+ ", age=" + age + ", deathDate=" + deathDate + ", hands=" + hands + ", legs=" + legs + ", birthPlace="
				+ birthPlace + ", deathPlace=" + deathPlace + ", girlFriendname=" + girlFriendname + ", relationShip="
				+ relationShip + "]";
	}
}
