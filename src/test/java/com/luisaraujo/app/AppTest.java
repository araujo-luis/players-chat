package com.luisaraujo.app;

import static org.junit.Assert.assertEquals;

import com.luisaraujo.app.models.Player;
import com.luisaraujo.app.controllers.ChatController;
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
    public void shouldAnswerWithMessageAndCountOne()
    {
        String response = chatController.sendMessage(initiator, receiver, "First Message");

        assertEquals("First Message | 1", response);
    }

    @Test
    public void shouldAnswerWithMessageAndCountTwo()
    {
        String firstResponse = chatController.sendMessage(initiator, receiver, "First Message");

        String secondResponse = chatController.sendMessage(initiator, receiver, "Second Message");

        assertEquals("First Message | 1", firstResponse);
        assertEquals("Second Message | 2", secondResponse);
    }

    @Test
    public void shouldAnswerWithMaxMessagesReached()
    {
        chatController.sendMessage(initiator, receiver, "First Message");
        chatController.sendMessage(initiator, receiver, "Second Message");
        chatController.sendMessage(initiator, receiver, "Third Message");
        chatController.sendMessage(initiator, receiver, "Fourth Message");
        chatController.sendMessage(initiator, receiver, "Fifth Message");
        chatController.sendMessage(initiator, receiver, "Sixth Message");
        chatController.sendMessage(initiator, receiver, "Seventh Message");
        chatController.sendMessage(initiator, receiver, "Eighth Message");
        chatController.sendMessage(initiator, receiver, "Ninth Message");
        chatController.sendMessage(initiator, receiver, "Tenth Message");
        String finalResponse = chatController.sendMessage(initiator, receiver, "Eleventh Message");

        assertEquals("You have reached the max messages allowed", finalResponse);
    }
}
