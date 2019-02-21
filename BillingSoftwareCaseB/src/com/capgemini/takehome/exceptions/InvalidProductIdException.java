package com.capgemini.takehome.exceptions;

public class InvalidProductIdException extends Exception {

	public InvalidProductIdException() {
		super();
		
	}

	public InvalidProductIdException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public InvalidProductIdException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public InvalidProductIdException(String message) {
		super(message);
		
	}

	public InvalidProductIdException(Throwable cause) {
		super(cause);
		
	}
	

}
