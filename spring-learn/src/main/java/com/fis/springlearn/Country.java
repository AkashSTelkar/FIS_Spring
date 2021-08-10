package com.fis.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

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

	// If you don't override toString() ie (you comment the toString() ) then you
	// will get output as address of class

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}

}
