package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.entity.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

/**
 * Servlet implementation class GetAllStudents
 */
@WebServlet("/GetAllStudents")
public class GetAllStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentService studentService=new StudentServiceImpl();
		List<Student> allStudents=studentService.getAllStudent();
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		for(Student student: allStudents) {
			out.write(student+"<br>");
		}
	}

}
