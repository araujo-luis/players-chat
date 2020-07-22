package com.luisaraujo.app.controllers;

import com.luisaraujo.app.models.Player;
import com.luisaraujo.app.services.ChatService;
import com.luisaraujo.app.services.impl.ChatServiceImpl;

public class ChatController {

    private ChatService chatService;

    public ChatController(){
        chatService = new ChatServiceImpl();
    }

    public String sendMessage(Player initiator, Player receiver, String message){
        return chatService.sendMessage(initiator, receiver, message);
    }

}