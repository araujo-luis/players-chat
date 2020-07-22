package com.luisaraujo.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Player initiator = new Player("initiator");

    Player receiver = new Player("receiver");

    ChatController chatController = new ChatController();
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
