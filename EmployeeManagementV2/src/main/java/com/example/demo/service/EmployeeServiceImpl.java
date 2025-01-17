package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo empRepo;
	
	@Override
	public void saveEmployee(Employee emp) {
		empRepo.save(emp);
	}

	@Override
	public Employee findEmployee(int empId) {
		return empRepo.findById(empId).get();
	}

	@Override
	public void removeEmployee(int empId) {
		empRepo.deleteById(empId);
	}

	@Override
	public List<Employee> findAllEmployee() {
		return empRepo.findAll();
	}

}
