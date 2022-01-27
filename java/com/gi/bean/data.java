package com.gi.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@JsonRootName("data")
public class data 
{
	
	private String taskName;
    private String taskId;
    private String taskBy;
    private String taskSerialNo;
    
    @Embedded
    private taskspecs taskSpecs;
    

}
