package com.luisaraujo.app.services.impl;

import com.luisaraujo.app.models.Message;
import com.luisaraujo.app.models.Player;
import com.luisaraujo.app.services.ChatService;

public class ChatServiceImpl implements ChatService {
    
    private Message message;

    public ChatServiceImpl() {
        
    }

    public String sendMessage(Player initiator, Player receiver, String message){
        this.message = new Message(initiator, receiver, message);
        Integer counter = initiator.getSentMessages().get(receiver) == null? 0: initiator.getSentMessages().get(receiver);
        counter++;
        initiator.setSentMessages(receiver, counter);
        receiver.setReceivedMessages(initiator, counter);
        return this.message.getMessage() + " | " + receiver.getReceivedMessage(initiator);
    }

    public String receiveMessage(Player initiator, String message){
        return null;
    }
}