package com.addressbook.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.addressbook.app.entity_dto.PersonModel;

@Repository
public interface AddRepo extends JpaRepository<PersonModel, Integer>{

}
