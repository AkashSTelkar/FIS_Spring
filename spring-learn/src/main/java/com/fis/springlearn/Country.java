package com.fis.springlearn;

import org.slf4j.LoggerFactory;

import org.slf4j.Logger;

public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	String code;
	String name;
	
	public Country() {
		
	}
	

}
