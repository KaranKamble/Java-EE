package com.example.demo.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepo repo;

	public StudentServiceImpl(StudentRepo repo) {
		this.repo = repo;
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public void addStudent(Student student) {
		repo.save(student);
	}

	@Override
	public Student getStudent(int rollNo) {
		return repo.findById(rollNo).get();
	}

	@Override
	public void removeStudent(int rollNo) {
		repo.deleteById(rollNo);
	}

}
