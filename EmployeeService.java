package com.sid.SurajInformaticsDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.SurajInformaticsDemo.dao.EmployeeDao;
import com.sid.SurajInformaticsDemo.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;

	public List<Employee> getAllData() {
		return ed.getAllData();
	}

	public String insertData(Employee employee) {
		return ed.insertData(employee);

	}

	public String updateData(int id) {
		return ed.updateData(id);

	}

	public String deleteData(int id) {
		return ed.deleteData(id);

	}

	// -------------------------------------------------------

	public List<Employee> getOnlyBcaEmployee() {
		return ed.getOnlyBcaEmployee();
	}

	public List<Employee> getEmployeePerceBetw50To80() {
		return ed.getEmployeePerceBetw50To80();

	}

}
