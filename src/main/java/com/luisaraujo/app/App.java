package com.luisaraujo.app;

import com.luisaraujo.app.controllers.ChatController;
import com.luisaraujo.app.models.Player;
import com.luisaraujo.app.exceptions.MessageLimitException;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main( String[] args ) throws MessageLimitException{
        
        Player initiator = new Player("initiator");

        Player receiver = new Player("receiver");

        ChatController chatController = new ChatController();
        
        System.out.println(chatController.sendMessage(initiator, receiver, "First Message"));
        System.out.println(chatController.sendMessage(initiator, receiver, "Second Message"));
        
    }
}
