package com.student.exceptions;

public class DataAccessException extends RuntimeException{
	private static final long serialVersionUID = -6939704778713362276L;

	public DataAccessException(String str) {
		super(str);
	}
}
