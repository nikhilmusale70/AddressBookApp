package com.payroll.employee_payroll.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookController {
	
	@GetMapping("/getAdd")
	public String getAdd() {
		return "displaying all the contacts";
	}
	
	@GetMapping("/getAdd/{id}")
	public String getAddById(@RequestParam(value = "id")int id) {
		return "displaying id contact";
	}
	
	@PutMapping("/putAdd/{id}")
	public String putAdd(@RequestParam(value = "id")int id) {
		return "updating in contact";
	}
	
	@DeleteMapping("/deleteAdd/{id}")
	public String deleteAdd(@RequestParam(value = "id")int id) {
		return "updating in contact";
	}
}
