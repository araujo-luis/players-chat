package com.luisaraujo.app.models;

public class Message {
    private String message;

    private Player iniciator;

    private Player receiver;

    public String getMessage(){
        return message;
    }

    public Player getInitiatorPlayer(){
        return iniciator;
    }

    public Player getReceiverPlayer(){
        return receiver;
    }

    public Message(Player iniciator, Player receiver, String message){ 
        this.message = message;
        this.receiver = receiver;
        this.iniciator = iniciator;
    }

}