package com.payroll.employee_payroll.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.payroll.employee_payroll.model.PersonModel;
import com.payroll.employee_payroll.service.AddressBookServiceLayer;

@RestController
public class AddressBookController {
	
	@Autowired
	AddressBookServiceLayer asl;
	
	@PostMapping("/add")
	public PersonModel addPerson(@Valid @RequestBody PersonModel pm) {
		asl.add(pm);
		return pm;
	}
	
	@GetMapping("/findAll")
	public List<PersonModel> getAllAdd(){
		return asl.getAllAdd();
	}
	
	@GetMapping("/getAdd/{id}")
	public PersonModel getAddById(@PathVariable(value = "id") int id) {
		return asl.finById(id);
	}
	
	@PutMapping("/putAdd/{id}")
	public PersonModel putAdd(@PathVariable(value = "id") int id, @RequestBody PersonModel pm) {
		asl.put(id, pm);
		return pm;
	}
	
	@DeleteMapping("/deleteAdd/{id}")
	public String deleteAdd(@PathVariable(value = "id") int id) {
		asl.delete(id);
		return "Contact deleted";
	}
	
}
