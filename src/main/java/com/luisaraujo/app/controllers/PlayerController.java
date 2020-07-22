package com.luisaraujo.app.models;

import com.luisaraujo.app.services.PlayerService;
import com.luisaraujo.app.services.impl.PlayerServiceImpl;

public class PlayerController {

    private PlayerService playerService;

    public PlayerController(String playerName){
        playerService = new PlayerServiceImpl(playerName);
    }

    public String initGame() {
        return null;
    }
    
}