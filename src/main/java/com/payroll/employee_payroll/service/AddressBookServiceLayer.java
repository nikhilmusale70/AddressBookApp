package com.payroll.employee_payroll.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.employee_payroll.Entity.Employee;
import com.payroll.employee_payroll.model.PersonModel;
import com.payroll.employee_payroll.repo.AddRepo;

@Service
public class AddressBookServiceLayer {

	@Autowired
	AddRepo addRepo;

	public void add(PersonModel pm) {
		addRepo.save(pm);
	}
	
	public List<PersonModel> getAllAdd() {
		return addRepo.findAll();
	}
	
	public PersonModel finById(int id) {
		return addRepo.findById(id).orElse(null);
	}
	
	public void put(int id,PersonModel pm) {
		PersonModel personModel = addRepo.findById(id).orElse(null);
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
