package com.luisaraujo.app.services;

import com.luisaraujo.app.models.Player;

public interface ChatService {

    public String sendMessage(Player initiator, Player receiver, String message);
    
}