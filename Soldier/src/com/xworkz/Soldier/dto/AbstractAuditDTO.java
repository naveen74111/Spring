package com.xworkz.Soldier.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class AbstractAuditDTO implements Serializable{

	private String createdBy;
	private LocalDateTime createDate;
	private String updatedBy;
	private LocalDateTime updatedDate;
}
