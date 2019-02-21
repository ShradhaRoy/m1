package com.capgemini.salesmanagement.exceptions;

public class ProductLimitSurpassedException extends Exception {

	public ProductLimitSurpassedException() {
		super();
		
	}

	public ProductLimitSurpassedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public ProductLimitSurpassedException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ProductLimitSurpassedException(String message) {
		super(message);
		
	}

	public ProductLimitSurpassedException(Throwable cause) {
		super(cause);
	}

}
