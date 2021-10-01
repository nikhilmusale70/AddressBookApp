package com.addressbook.app.entity_dto;

import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Table(name = "address_book")
public @Data class PersonModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "addId")
	int id;
	
	@Column(name = "fname")
	String fname;
	
	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message ="Last Name invalid")
	@Column(name = "lname")
	String lname;
	
	@Column(name = "gender")
	char gender;
	
	@Min(value = 10, message = "Age should be above 10")
	@Column(name = "age")
	int age;
	
	@Column(name = "address")
	String address;
	
	@ElementCollection(targetClass = String.class)
	@CollectionTable(name="Add_Type",joinColumns=@JoinColumn(name="id"))
	@Column(name="AddressBook_Type")
	public List<String> addType;
}
