package com.example.demo.service;
import com.example.demo.model.Student;

public class StudentService {

	public void saveStudent( Student student) {
		System.out.println("Dear "+student.getName()+" you are added in DataBase");
	}
	
	public Student fatchStudent( int rollNo) {
		Student student = new Student();
		student.setRollNO(rollNo);
		student.setName("John");
		student.setEmail("john@gmail.com");
		System.out.println("Fetching Roll NO. "+rollNo);
		return student;
	}
}
