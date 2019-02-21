package com.capgemini.salesmanagement.exceptions;

public class IncorrectPriceException extends Exception {

	public IncorrectPriceException() {
		super();
		
	}

	public IncorrectPriceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public IncorrectPriceException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public IncorrectPriceException(String message) {
		super(message);
		
	}

	public IncorrectPriceException(Throwable cause) {
		super(cause);
		
	}

}
