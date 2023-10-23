package org.com.example.service;

import java.util.List;

import org.com.example.model.Student;
import org.com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository repo;

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	

}
