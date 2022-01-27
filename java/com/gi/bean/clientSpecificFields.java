package com.gi.bean;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@JsonRootName("clientSpecificFields")
public class clientSpecificFields {

	
	private Date HCL_case_date;
	private Date Date_of_joining;
}
