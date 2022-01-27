package com.gi.bean;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@JsonRootName("ComponentScoping")
public class ComponentScoping {

	private String SBU_NAME;
    private String CRNCreationDate;
    private String Package_Name;
    private String CASE_NUMBER;
    private String CLIENT_NAME;
    private String CASE_UUID;
    private String Candidate_Name;
    private String CLIENT_CODE;
    private String CASE_REF_NUMBER;
    private String TYPE;
    private String BaseEJCCountryList;
    
    @Embedded
    private caseDetails casedetails; 
    
    @Embedded
    private Components components;
	
    @Embedded
    private clientSpecificFields csf;
    
    @Embedded
    private caseReference casereference;
    
}
