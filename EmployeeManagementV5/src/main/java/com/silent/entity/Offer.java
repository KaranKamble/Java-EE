package com.silent.entity;

import java.util.Date;
import jakarta.persistence.*;

@Entity
public class Offer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double salary;
    @Temporal(TemporalType.DATE)
    private Date joinDate;
    private boolean accepted; 
    
    public Offer() {
	}

	public Offer(double salary, Date joinDate, boolean accepted) {
		this.salary = salary;
		this.joinDate = joinDate;
		this.accepted = accepted;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Offer [id=" + id + ", salary=" + salary + ", joinDate=" + joinDate + ", accepted=" + accepted + "]";
	}
  
}
