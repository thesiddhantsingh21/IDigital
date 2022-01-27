package com.gi.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import lombok.Data;
@Entity
@Data
public class taskspecs {

	
	@Embedded
	private ComponentScoping componentscoping;
	
}
