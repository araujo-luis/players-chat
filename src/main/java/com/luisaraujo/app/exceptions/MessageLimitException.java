package com.luisaraujo.app.exceptions;

public class MessageLimitException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public MessageLimitException(String message) {
		super(message);
	}

}