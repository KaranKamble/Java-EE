package com.silent.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import com.silent.main.entity.Employee;
import com.silent.main.exception.EmployeeServiceException;
import com.silent.main.repository.EmployeeRepo;

@Service
@Configuration
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	@Override
	public void addEmployee(Employee employee) {

		if (employee.getCity().equals("delhi"))
			throw new EmployeeServiceException("Please check your eyes o-o, Employee outside from MH are not allowed");

		try {
			 System.out.println(10/0);
			repo.save(employee);
		} catch (Exception ex) {
			throw new EmployeeServiceException("Something Went wrong, while adding employee in DB. Please try again ");
		}
	}

	@Override
	public Employee getEmployee(int empId) {
		if (empId == 0)
			throw new EmployeeServiceException("Please check your o-o eyes, and Enter valid employee id ");
		else {
			Optional<Employee> emp = repo.findById(empId);
			return emp.get();
		}
	}

}
