package com.booking.common;

public class GenericException extends Exception {

	private static final long serialVersionUID = 1L;

	private String message;

	public GenericException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
