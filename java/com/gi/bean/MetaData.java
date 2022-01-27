package com.gi.bean;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class MetaData {
	
	private String processName;
	private String processId;
	private String stageId;
	private String task;
	private String taskGroupI;
    private Date requestDate;
    private String requestId;
	private String version;
    private String attempt;
    private String multiTask;
    private String requestAuthToken;
    private String txLabel;
    
    @Embedded
    private data Data;

}
