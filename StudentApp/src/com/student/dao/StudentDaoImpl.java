package com.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.student.dao.factory.DBConnectionFactory;
import com.student.entity.Student;
import com.student.exceptions.DataAccessException;

public class StudentDaoImpl implements StudentDao{

	private Connection connection;
	
	public StudentDaoImpl() {
		connection=DBConnectionFactory.getConnection();
	}
	
	@Override
	public void AddStudent(Student student) {
		try {
			PreparedStatement pstmt=connection.prepareStatement("insert into training(Stud_name,Stream,Percentage) values(?,?,?)");
			pstmt.setString(1, student.getStud_name());
			pstmt.setString(2, student.getStream());
			pstmt.setDouble(3, student.getPercentage());
			int n=pstmt.executeUpdate();
			if(n!=1) {
				throw new SQLException("can't add the student");
				
			}
		} catch (SQLException e) {
			throw new DataAccessException(e.getMessage());
		}
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> allStudents=new ArrayList<Student>();
		try {
			PreparedStatement pstmt=connection.prepareStatement("select * from training");
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				allStudents.add(new Student(rs.getInt("Sap_ID"),
											rs.getString("Stud_name"),
											rs.getString("Stream"),
											rs.getDouble("Percentage")
											)
								);
			}
		} catch (SQLException e) {
			throw new DataAccessException(e.getMessage());
		}
		
		
		return allStudents;
	}
	
}
