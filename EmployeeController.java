package com.sid.SurajInformaticsDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sid.SurajInformaticsDemo.entity.Employee;
import com.sid.SurajInformaticsDemo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;

	// CRUD OPEARATION

	@GetMapping("getalldata")
	public List<Employee> getAllData() {
		return es.getAllData();
	}

	@PostMapping("insertdata")
	String insertData(@RequestBody Employee employee) {
		return es.insertData(employee);
	}

	@PutMapping("updatedata/{id}")
	public String updateData(@PathVariable int id) {
		return es.updateData(id);
	}

	@DeleteMapping("deletedata/{id}")
	String deleteData(@PathVariable int id) {
		return es.deleteData(id);
	}

	// ------------------------------------------------------//
	// some other Rest APIs

	@GetMapping("onlybca")
	List<Employee> getOnlyBcaEmployee() {
		return es.getOnlyBcaEmployee();
	}

	@GetMapping("emp50to80")
	List<Employee> getEmployeePerceBetw50To80() {
		return es.getEmployeePerceBetw50To80();
	}

}
