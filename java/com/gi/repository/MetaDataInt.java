package com.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gi.bean.MetaData;

public interface MetaDataInt extends JpaRepository<MetaData, String> {

}
