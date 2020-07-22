package com.luisaraujo.app.services.impl;

import com.luisaraujo.app.models.Message;
import com.luisaraujo.app.models.Player;
import com.luisaraujo.app.services.PlayerService;

public class PlayerServiceImpl implements PlayerService {
    
    private Player player;
    
    private Message message;

    public PlayerServiceImpl(String playerName) {
        player = new Player(playerName);
    }
    public String sendMessage(String message, Player receiver){
        return null;
    }

    public String receiveMessage(Player initiator, String message){
        return null;
    }
}