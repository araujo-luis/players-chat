package com.luisaraujo.app.models;

import java.util.HashMap;

public class Player {

    private String name;

    private HashMap<Player, Integer> receivedMessages;

    private HashMap<Player, Integer> sentMessages;
    
    public Player(String name){
        this.name = name;
        receivedMessages = new HashMap<Player, Integer>();
        sentMessages = new HashMap<Player, Integer>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReceivedMessages(HashMap<Player, Integer> receivedMessages) {
        this.receivedMessages = receivedMessages;
    }

    public HashMap<Player, Integer> getReceivedMessages() {
        return this.receivedMessages;
    }

    public void setSentMessages(HashMap<Player, Integer> sentMessages) {
        this.sentMessages = sentMessages;
    }

    public HashMap<Player, Integer> getSentMessages() {
        return this.sentMessages;
    }

    
}