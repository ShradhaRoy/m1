package com.capgemini.takehome.exceptions;

public class NoProductAvailableException extends Exception {

	public NoProductAvailableException() {
		super();
	}

	public NoProductAvailableException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoProductAvailableException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoProductAvailableException(String message) {
		super(message);
	}

	public NoProductAvailableException(Throwable cause) {
		super(cause);
	}

}
