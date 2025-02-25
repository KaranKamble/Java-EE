package com.silent.dto;

import java.util.Date;

public class OnboardingDTO {

	private String name;
	private String city;
	
	private double salary;
    private Date joinDate;
    private boolean accepted; 
    
    public OnboardingDTO() {
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	@Override
	public String toString() {
		return "OnboardingDTO [name=" + name + ", city=" + city + ", salary=" + salary + ", joinDate=" + joinDate
				+ ", accepted=" + accepted + "]";
	}
}
