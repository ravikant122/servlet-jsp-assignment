package com.student.service;

import java.util.List;

import com.student.entity.Student;

public interface StudentService {
	public void AddStudent(Student student);
	public List<Student> getAllStudent();
}
