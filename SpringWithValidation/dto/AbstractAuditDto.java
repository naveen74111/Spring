package com.xworkz.firstAidKit.dto;

import java.io.Serializable;
import java.time.LocalDate;
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
public abstract class AbstractAuditDto implements Serializable {

	private String createBy;
	private LocalDate createDate;
	private String updatedBy;
	private LocalDateTime updateDate;
}
