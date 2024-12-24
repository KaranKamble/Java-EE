package com.example.demo.controller;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	private StudentService service;
	
	public StudentController( StudentService service ) {
		this.service = service;
	}
	
	@PostMapping("/student/add")
	public String addStudent( @RequestBody Student student ) {
		this.service.addStudent(student);
		return "Dear "+student.getName()+" you are added in DB";			
	}
	
	@GetMapping("/student/getAll")
	public List<Student> getAllStudents(){
		return this.service.getAllStudents();
	}
	
	@GetMapping("/student/{rollNo}")
	public Student getStudentByRollNo( @PathVariable("rollNo") int rollNo ) {
		return this.service.getStudent(rollNo);
	}
	
	@DeleteMapping("/student/{rollNo}")
	public String removeStudentByRollNo( @PathVariable("rollNo") int rollNo ) {
		this.service.removeStudent(rollNo);
		return "rollNo "+rollNo+" has removed successfully";
	}
}
