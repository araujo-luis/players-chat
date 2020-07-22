package com.luisaraujo.app;

import com.luisaraujo.app.controllers.ChatController;
import com.luisaraujo.app.controllers.PlayerController;
import com.luisaraujo.app.models.Player;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main( String[] args ){
        
        Player initiator = new Player("initiator");

        Player receiver = new Player("receiver");

        ChatController chatController = new ChatController();

        chatController.sendMessage(initiator, receiver, "First Message");

        System.out.println( "Hello World!" );
    }
}
