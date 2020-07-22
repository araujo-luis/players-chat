package com.luisaraujo.app;

import com.luisaraujo.app.controllers.PlayerController;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main( String[] args ){
        
        PlayerController initiator = new PlayerController("initiator");

        PlayerController receiver = new PlayerController("receiver");

        System.out.println( "Hello World!" );
    }
}
