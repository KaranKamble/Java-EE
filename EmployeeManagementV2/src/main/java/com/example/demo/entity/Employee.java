package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private int empId;
	private String name;
	private String city;
	
	public Employee() {
	}

	public Employee(int empId, String name, String city) {
		this.empId = empId;
		this.name = name;
		this.city = city;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
