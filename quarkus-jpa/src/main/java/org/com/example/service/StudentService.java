package org.com.example.service;

import java.util.List;

import org.com.example.model.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student saveStudent(Student student);

	

}
