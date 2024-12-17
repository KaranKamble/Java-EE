package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public void addEmployee( Employee emp ) {
		System.out.println("Adding Employee "+emp.getName()+" info in DB");
	}
	
	@Override
	public Employee getEmployee( int empId ) {
		System.out.println("Fetching Employee info from DB");
		return null;
	}
}
