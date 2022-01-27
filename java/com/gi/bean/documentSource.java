package com.gi.bean;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.AllArgsConstructor;
import lombok.Data;
@Entity
@Data
@AllArgsConstructor
@JsonRootName("documentSource")
public class documentSource {

	private boolean associated;
    private String section;
    private String type;
    
}
