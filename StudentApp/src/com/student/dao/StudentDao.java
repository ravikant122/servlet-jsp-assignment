package com.student.dao;

import java.util.List;

import com.student.entity.Student;

public interface StudentDao {
	public void AddStudent(Student student);
	public List<Student> getAllStudent();
}
