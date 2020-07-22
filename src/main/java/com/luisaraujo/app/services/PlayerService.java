package com.luisaraujo.app.services;

import com.luisaraujo.app.models.Player;

public interface PlayerService {

    public String sendMessage(String message, Player receiver);

    public String receiveMessage(Player initiator, String message);
    
}