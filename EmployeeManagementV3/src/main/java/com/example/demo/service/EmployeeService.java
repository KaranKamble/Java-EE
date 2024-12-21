package com.example.demo.service;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	void saveEmployee(Employee student);
	Employee findEmployee(int empId);
	void removeEmployee(int empId);
}
