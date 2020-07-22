package com.luisaraujo.app.controllers;

import com.luisaraujo.app.models.Player;
import com.luisaraujo.app.services.ChatService;
import com.luisaraujo.app.services.impl.ChatServiceImpl;
import com.luisaraujo.app.exceptions.MessageLimitException;

/**
 * @author Luis Araujo
 *
 */
public class ChatController {

	private ChatService chatService;

	public ChatController() {
		chatService = new ChatServiceImpl();
	}

	/**
	 * @param initiator Player who sends a message to
	 * @param receiver Player who receives a message from
	 * @param message 
	 * @return Message resposne with counter
	 * @throws MessageLimitException
	 */
	public String sendMessage(Player initiator, Player receiver, String message) throws MessageLimitException {
		return chatService.sendMessage(initiator, receiver, message);
	}

}