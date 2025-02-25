package com.silent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.silent.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
