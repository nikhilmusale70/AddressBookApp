package com.addressbook.app.entity_dto;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class PersonDto {
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message ="First Name invalid")
	String fname;
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message ="Last Name invalid")
	String lname;
	@Min(value = 10, message = "Age should be above 10")
	int age;
	char gender;
	String address;
	public List<String> addType;

}
