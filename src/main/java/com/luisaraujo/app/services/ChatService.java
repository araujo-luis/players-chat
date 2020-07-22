package com.luisaraujo.app.services;

import com.luisaraujo.app.models.Player;
import com.luisaraujo.app.exceptions.MessageLimitException;

/**
 * @author Luis Araujo
 *
 */
public interface ChatService {

	/**
	 * @param initiator Player who sends a message to
	 * @param receiver Player who receives a message from
	 * @param message 
	 * @return Message response with counter
	 * @throws MessageLimitException
	 */
	public String sendMessage(Player initiator, Player receiver, String message) throws MessageLimitException;

}