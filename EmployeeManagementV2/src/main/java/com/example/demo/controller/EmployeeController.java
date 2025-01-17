package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService serviceImpl;
	
	@PostMapping("/save")
	public String saveEmployee( @RequestBody Employee emp ) {
		serviceImpl.saveEmployee(emp);
		return emp.getName()+" has saved in DB successfully";
	}
	
	@GetMapping("/get")
	public List<Employee> findAllEmployee(){
		return serviceImpl.findAllEmployee();
	}
	
	@GetMapping("/get/{empId}")
	public Employee getEmployee( @PathVariable("empId") int empId) {
		return serviceImpl.findEmployee(empId);
	}
	
	@DeleteMapping("/del/{empId}")
	public String removeEmployee( @PathVariable("empId") int empId ) {
		serviceImpl.removeEmployee(empId);
		return "Employee Id "+empId+" removed successfully";
	}
}
