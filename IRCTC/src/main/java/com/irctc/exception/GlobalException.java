package com.irctc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler( TrainException.class )
	public ResponseEntity<Object> trainExceptionHandler( TrainException trainException){
		return new ResponseEntity<Object>(trainException.getMyMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler( Exception.class )
	public ResponseEntity<Object> genericExceptionHandler( Exception exception ){
		return new ResponseEntity<Object>(exception.getMessage(),HttpStatus.BAD_REQUEST);
	}
}
