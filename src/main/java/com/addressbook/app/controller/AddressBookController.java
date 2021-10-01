package com.addressbook.app.controller;

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

import com.addressbook.app.entity_dto.PersonModel;
import com.addressbook.app.service.InterfaceAddressService;

@RestController
public class AddressBookController {
	
	@Autowired
	InterfaceAddressService interfaceAddressService;
	
	@PostMapping("/add")
	public PersonModel addPerson(@Valid @RequestBody PersonModel pm) {
		interfaceAddressService.add(pm);
		return pm;
	}
	
	@GetMapping("/findAll")
	public List<PersonModel> getAllAdd(){
		return interfaceAddressService.getAllAdd();
	}
	
	@GetMapping("/getAdd/{id}")
	public PersonModel getAddById(@PathVariable(value = "id") int id) {
		return interfaceAddressService.finById(id);
	}
	
	@PutMapping("/putAdd/{id}")
	public PersonModel putAdd(@PathVariable(value = "id") int id, @RequestBody PersonModel pm) {
		interfaceAddressService.put(id, pm);
		return pm;
	}
	
	@DeleteMapping("/deleteAdd/{id}")
	public String deleteAdd(@PathVariable(value = "id") int id) {
		interfaceAddressService.delete(id);
		return "Contact deleted";
	}
	
}
