package com.silent.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.silent.main.entity.Employee;
import com.silent.main.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/add")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
		return new ResponseEntity<String>("Employee Added", HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> fetchEmployee(@PathVariable("id") int id) {
		Employee emp = service.getEmployee(id);
		return new ResponseEntity<Object>(emp, HttpStatus.OK);
	}
}
