package com.payroll.employee_payroll.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.payroll.employee_payroll.model.PersonModel;

@Service
public class AddressBookServiceLayer {

	ArrayList<PersonModel> personList = new ArrayList<>();
	
	public void add(PersonModel pm) {
		personList.add(pm);
	}
	
	public List<PersonModel> getAllAdd() {
		return personList;
	}
	
	public PersonModel finById(int id) {
		return personList.get(id);
	}
	
	public void put(int id,PersonModel pm) {
		personList.remove(id);
		personList.add(id,pm);
	}
	
	public void delete(int id) {
		personList.remove(id);
	}
}
