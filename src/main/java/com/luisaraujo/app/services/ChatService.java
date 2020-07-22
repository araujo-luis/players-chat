package com.luisaraujo.app.services;

import com.luisaraujo.app.models.Player;
import com.luisaraujo.app.exceptions.MessageLimitException;

public interface ChatService {

    public String sendMessage(Player initiator, Player receiver, String message) throws MessageLimitException;
    
}