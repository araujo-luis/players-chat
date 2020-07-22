package com.luisaraujo.app.controllers;

import com.luisaraujo.app.services.ChatService;
import com.luisaraujo.app.services.impl.ChatServiceImpl;

public class ChatController {

    private ChatService chatService;

    public ChatController(){
        chatService = new ChatServiceImpl();
    }

    public sendMessage(Player initiator, Player receiver, String message){
        chatService.sendMessage(initiator, receiver, message);
    }

}