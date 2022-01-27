package com.gi.bean;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
@JsonRootName("caseReference")
public class caseReference {
	
	private String clientId;
    private String sbuId;
    private Date crnCreatedDate;
    private String packageId;
    private String crnNo;
    private Date scrnCreatedDate;
    private int caseNo;
    private String caseUUID;
    private String caseType;

}
