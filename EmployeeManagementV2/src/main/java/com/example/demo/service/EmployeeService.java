package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	void saveEmployee(Employee student);
	Employee findEmployee(int empId);
	List<Employee> findAllEmployee();
	void removeEmployee(int empId);
}
