package com.silent.main.service;

import com.silent.main.entity.Employee;

public interface EmployeeService {
	
	void addEmployee( Employee employee );
	
	Employee getEmployee( int empId);

}
