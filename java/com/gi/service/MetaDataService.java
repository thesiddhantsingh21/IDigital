package com.gi.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.gi.repository.MetaDataInt;

@Service
@Transactional
public class MetaDataService {

	@SuppressWarnings("unused")
	private final MetaDataInt metadataint;
	
	public MetaDataService(MetaDataInt metadataint)
	{
		this.metadataint= metadataint;
	}
	
	
	
	
	
	
	
}
