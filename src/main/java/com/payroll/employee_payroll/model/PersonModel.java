package com.payroll.employee_payroll.model;

import javax.persistence.GeneratedValue;

import lombok.Data;

public @Data class PersonModel {
	int id;
	String fname;
	String lname;
	char gender;
	int age;
	
}
