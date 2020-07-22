package com.luisaraujo.app;

import static org.junit.Assert.assertEquals;
import org.junit.rules.ExpectedException;

import com.luisaraujo.app.models.Player;
import com.luisaraujo.app.controllers.ChatController;
import com.luisaraujo.app.exceptions.MessageLimitException;
import org.junit.Test;
import org.junit.Rule;

/**
 * @author Luis Araujo
 *
 */
public class AppTest {
	Player initiator = new Player("initiator");

	Player receiver = new Player("receiver");

	ChatController chatController = new ChatController();

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	/**
	 * Test with one message
	 * 
	 * @throws MessageLimitException
	 */
	@Test
	public void shouldAnswerWithMessageAndCountOne() throws MessageLimitException {

		String response = chatController.sendMessage(initiator, receiver, "First Message");

		assertEquals("First Message | 1", response);
	}

	/**
	 * Test with two sent messages 
	 * 
	 * @throws MessageLimitException
	 */
	@Test
	public void shouldAnswerWithMessageAndCountTwo() throws MessageLimitException {
		String firstResponse = chatController.sendMessage(initiator, receiver, "First Message");

		String secondResponse = chatController.sendMessage(initiator, receiver, "Second Message");

		assertEquals("First Message | 1", firstResponse);
		assertEquals("Second Message | 2", secondResponse);
	}

	/**
	 * Test which retrieves Exception since has reached max messages allowed
	 * 
	 * @throws MessageLimitException
	 */
	@Test
	public void shouldThrowMessageLimitExceptionException() throws MessageLimitException {
		exception.expect(MessageLimitException.class);
		exception.expectMessage("You have reached the max messages allowed");
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
		chatController.sendMessage(initiator, receiver, "Eleventh Message");
	}
}
