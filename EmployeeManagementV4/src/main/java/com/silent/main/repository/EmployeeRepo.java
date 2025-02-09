package com.silent.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.silent.main.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
