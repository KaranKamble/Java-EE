package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int rollNo;
	private String name;
	private String city;
	
	public Student() {

	}

	public Student(int rollNo, String name, String city) {
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	@Override
	public String toString() {
	//	return "Student [rollNo=" + rollNo + ", name=" + name + ", city=" + city + "]";
		return String.format("%-5d%-12s%-12s", this.rollNo, this.name, this.city);
	}
	
	
}
