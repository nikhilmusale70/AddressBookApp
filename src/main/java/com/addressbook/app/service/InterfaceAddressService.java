package com.addressbook.app.service;

import java.util.List;

import com.addressbook.app.entity_dto.PersonModel;


public interface InterfaceAddressService {

	void add(PersonModel pm);

	List<PersonModel> getAllAdd();

	PersonModel finById(int id);

	void put(int id, PersonModel pm);

	void delete(int id);	

}
