package com.luisaraujo.app.exceptions;

/**
 * @author Luis Araujo
 *
 */
public class MessageLimitException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * @param message Exception Message
	 */
	public MessageLimitException(String message) {
		super(message);
	}

}