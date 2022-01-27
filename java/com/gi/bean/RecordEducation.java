package com.gi.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@JsonRootName("RecordEduvation")
public class RecordEducation {

	private String Aka_Name;
    private String Completed_Pursuing;
    private String University_Location_State;
    private String University_City;
    private String University_Country;
    private String Unique_Number;
    private String Result;
    private String Is_the_document_clear;
    private String Regular_or_Correspondence;
    private String University_Name;
   
    private String Part_time_or_full_time;
    private String Qualification_name;
    private String Qualification_level;
    private String Grade;
    private String University_Aka_Name;
    private String Is_this_Professional_Education;
    private int INSTRUCTION_CHECK_ID;
    
    @Embedded
    private ruleResult ruleresult;
    
    
}
