package com.payroll.employee_payroll.model;

import javax.persistence.GeneratedValue;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class PersonModel {
	int id;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message ="First Name invalid")
	String fname;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message ="Last Name invalid")
	String lname;
	
	char gender;
	
	@Min(value = 10, message = "Age should be above 10")
	int age;
	
}
