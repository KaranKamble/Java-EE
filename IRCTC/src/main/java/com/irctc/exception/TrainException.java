package com.irctc.exception;

public class TrainException extends RuntimeException{
	
	private String message;
	
	public TrainException() {	
	}

	public TrainException(String message) {
		this.message = message;
	}
	
	public String getMyMessage() {
		return this.message;
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
