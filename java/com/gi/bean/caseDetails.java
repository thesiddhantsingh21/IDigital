package com.gi.bean;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@JsonRootName("caseDetails")
public class caseDetails {
	
	private String Type_of_Check;
    private String Package_Name;
    private String Request_Status;
    private Date Contact_Date;
    private String Do_you_have_a_date_when_we_can_contact_the_current_or_most_recent_employer_for_this_Candidate;
    private String Case_Origin;
    private String Email_To;
    private String Candidate_First_Name;
    private String Official_Email_Address;
    private Date Start_Date;
    private String SRT;
    private String Remarks;
    private String Client_Name;
    private String Subject_Type;
    private boolean Is_Duplicate_Case;
    private String SBU;
    private String LOA_Submitted;
    private String Personal_Email_Address;
    private String Candidate_Last_Name;
    private String Package_Type;
    private String Subject_Details_to_be_Entered_By;
    private String Email_Template;
    private int Client_Cost_Code;
    private String Client_Reference;
    private String Candidate_Middle_Name;
    private Date Case_Date;
    private Date Date_of_Birth;
    private String Do_you_grant_FADV_persmission; 

}
