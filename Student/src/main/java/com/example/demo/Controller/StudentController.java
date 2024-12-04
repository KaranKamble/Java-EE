package com.example.demo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class StudentController {

	@PostMapping("/student")
	public String addStudent(@RequestBody Student s) {
		System.out.println("adding to " + s.getName());
		return "Dear " + s.getName() + " you are added ";
	}

	@DeleteMapping("student/del/{rollNo}")
	String deleteStudent(@PathVariable("rollNo") int rollNo) {
		System.out.println("Roll No " + rollNo + " you are removed");
		return "Roll No " + rollNo + " has deleted";
	}

	@GetMapping("student/get/32")
	Student getStudent() {
		Student s = new Student();
		s.setName("john");
		s.setEmail("John@gmail.com");
		s.setRollNo(32);
		System.out.println("Fetching info of roll no. " + s.getRollNo());
		return s;
	}
}
