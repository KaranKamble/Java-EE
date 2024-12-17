package com.example.demo.service;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	void addEmployee( Employee emp );
	Employee getEmployee(int empId);
}
