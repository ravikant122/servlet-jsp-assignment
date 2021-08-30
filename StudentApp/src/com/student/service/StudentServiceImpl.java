package com.student.service;

import java.util.List;

import com.student.dao.StudentDao;
import com.student.dao.StudentDaoImpl;
import com.student.entity.Student;

public class StudentServiceImpl implements StudentService{

	private StudentDao sd;
	
	public StudentServiceImpl() {
		sd=new StudentDaoImpl();
	}
	
	@Override
	public void AddStudent(Student student) {
		sd.AddStudent(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return sd.getAllStudent();
	}
	
}
