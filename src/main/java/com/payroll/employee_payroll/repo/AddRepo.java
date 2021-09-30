package com.payroll.employee_payroll.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payroll.employee_payroll.model.PersonModel;

@Repository
public interface AddRepo extends JpaRepository<PersonModel, Integer>{

}
