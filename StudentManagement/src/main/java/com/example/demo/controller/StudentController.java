package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@PostMapping("student/save")
	public String addStudent(@RequestBody Student student) {
		StudentService service = new StudentService();
		service.saveStudent(student);
		return "Dear " + student.getName() + " you are added";
	}
	
	@GetMapping("student/{rollNo}")
	public Student getStudent( @PathVariable("rollNo")  int rollNo) {
		StudentService service = new StudentService();
		return service.fatchStudent(rollNo);
	}
}
