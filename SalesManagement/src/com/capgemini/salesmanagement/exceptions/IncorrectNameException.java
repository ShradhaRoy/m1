package com.capgemini.salesmanagement.exceptions;

public class IncorrectNameException extends Exception{

	public IncorrectNameException() {
		super();
		
	}

	public IncorrectNameException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public IncorrectNameException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public IncorrectNameException(String message) {
		super(message);
		
	}

	public IncorrectNameException(Throwable cause) {
		super(cause);
	}

}
