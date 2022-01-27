package com.gi.bean;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Components {

	private Date CANDIDATE_DE_COMPLETED_DT;
    private String PRODUCT;
    private String Component_name;
    private String component_Name;
    private boolean db_Component;
    
    @Embedded
    private Records records;
    
}
