package com.cg.fms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Land_tbl")
public class Land {

	@Id
	private int landId;
	private String surveyNumber;
	private String ownerName;
	private String landArea;

	
}
