package com.luisaraujo.app;

import com.luisaraujo.app.controllers.ChatController;
import com.luisaraujo.app.models.Player;
import com.luisaraujo.app.exceptions.MessageLimitException;

/**
 * Main Class, initialize the app
 * 
 * @author Luis Araujo
 *
 */
public class App {

	public static void main(String[] args) throws MessageLimitException {

		Player initiator = new Player("initiator");

		Player receiver = new Player("receiver");

		ChatController chatController = new ChatController();

        for (int i = 0; i < 10; i++) {
            System.out.println(chatController.sendMessage(initiator, receiver, "Message"));
        }
	}
}
