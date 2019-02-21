package com.capgemini.salesmanagement.exceptions;

public class InvalidSaleIdException extends Exception {

	public InvalidSaleIdException() {
		super();
		
	}

	public InvalidSaleIdException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public InvalidSaleIdException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public InvalidSaleIdException(String message) {
		super(message);
		
	}

	public InvalidSaleIdException(Throwable cause) {
		super(cause);
		
	}

}
