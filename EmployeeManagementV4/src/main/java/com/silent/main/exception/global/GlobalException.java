package com.silent.main.exception.global;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.silent.main.exception.EmployeeServiceException;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler( EmployeeServiceException.class )
	public ResponseEntity<Object> employeeExceptionHandler( EmployeeServiceException serviceException){
		return new ResponseEntity<Object>(serviceException.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler( Exception.class )
	public ResponseEntity<Object> genericExceptionHandler( Exception exception ) {
		return new ResponseEntity<Object>("something went wrong, Please try later",HttpStatus.BAD_REQUEST);
	}

}
