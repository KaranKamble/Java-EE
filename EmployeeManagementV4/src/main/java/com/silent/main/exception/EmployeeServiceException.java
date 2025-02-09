package com.silent.main.exception;

public class EmployeeServiceException extends RuntimeException {
 
	private String message;
	
	public EmployeeServiceException( String message ) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	
	
}
