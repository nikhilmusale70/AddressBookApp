package com.addressbook.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.addressbook.app.entity_dto.PersonModel;
import com.addressbook.app.exception.AddressBookException;
import com.addressbook.app.repo.AddRepo;

@Service
public class AddressBookServiceLayer implements InterfaceAddressService{

	@Autowired
	AddRepo addRepo;

	public void add(PersonModel pm) {
		addRepo.save(pm);
	}
	
	public List<PersonModel> getAllAdd() {
		return addRepo.findAll();
	}
	
	public PersonModel finById(int id) {
		return addRepo.findById(id).orElseThrow(()->new AddressBookException("Id not found"));
	}
	
	public void put(int id,PersonModel pm) {
		PersonModel personModel = addRepo.findById(id).orElseThrow(()->new AddressBookException("Id not found"));
		personModel.setFname(pm.getFname());
		personModel.setLname(pm.getLname());
		personModel.setAddress(pm.getAddress());
		personModel.setAge(pm.getAge());
		personModel.setGender(pm.getGender());
		
		addRepo.save(personModel);
	}
	
	public void delete(int id) {
		addRepo.deleteById(id);
}
}
