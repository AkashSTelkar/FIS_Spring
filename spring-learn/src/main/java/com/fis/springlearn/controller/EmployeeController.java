package com.fis.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.fis.springlearn.service.EmployeeService;


public class EmployeeController {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

	private EmployeeService employeeService;
	
	
	public EmployeeController() {
		LOGGER.debug("Inside Employee Controller");
	}

	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	@Override
	public String toString() {
		return "EmployeeController [employeeService=" + employeeService + "]";
	}

	
}