package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService serviceImpl;
	
	@PostMapping("/employee/save")
	public String saveEmployee( @RequestBody Employee emp ) {
		serviceImpl.saveEmployee(emp);
		return emp.getName()+" has saved in DB successfully";
	}
	
	@GetMapping("/employee/get/{empId}")
	public Employee getEmployee( @PathVariable("empId") int empId) {
		return serviceImpl.findEmployee(empId);
	}
	
	@DeleteMapping("/employee/del/{empId}")
	public String removeEmployee( @PathVariable("empId") int empId ) {
		serviceImpl.removeEmployee(empId);
		return "Employee Id "+empId+" removed successfully";
	}
}
