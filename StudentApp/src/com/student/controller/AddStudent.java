package com.student.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.student.entity.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

/**
 * Servlet implementation class AddStudent
 */
@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Stud_name=request.getParameter("Stud_name");
		String Stream=request.getParameter("Stream");
		String Percentage=request.getParameter("Percentage");
		Student student=new Student(Stud_name,Stream,Double.parseDouble(Percentage));
		
		StudentService studentService=new StudentServiceImpl();
		studentService.AddStudent(student);

		PrintWriter out=response.getWriter();
		out.write("student added");
	}

}
