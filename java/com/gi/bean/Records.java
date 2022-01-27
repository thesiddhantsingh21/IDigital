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
@JsonRootName("Records")
public class Records {

	private String Candidate_name;
    private long Personal_Mobile_No;
    private String Identification_Submitted;
    private String First_Name;
    private String Middle_Name;
    private String Gender;
    private String Doc_Identification_No;
    private String Marital_Status;
    private String Nationality;
    private long Home_phone;
    private Date DOB;
    private String Is_the_document_clear;
    private String Professional_Email_ID;
    private String Personal_Email_ID;
    private int INSTRUCTION_CHECK_ID;
    private String Father_Name;
    private String Last_Name;
    
    @Embedded
    private documentSource documentsource;
    
    @Embedded
    private ruleResult ruleresult;
    
}
