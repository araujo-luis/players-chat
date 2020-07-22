package com.luisaraujo.app.models;

import java.util.HashMap;

/**
 * @author Luis Araujo
 *
 * Player model
 */
public class Player {

	private String name;

	private HashMap<Player, Integer> receivedMessages;

	private HashMap<Player, Integer> sentMessages;

	public Player(String name) {
		this.name = name;
		receivedMessages = new HashMap<Player, Integer>();
		sentMessages = new HashMap<Player, Integer>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setReceivedMessages(Player player, Integer counter) {
		this.receivedMessages.put(player, counter);
	}

	public Integer getReceivedMessage(Player player) {
		return this.receivedMessages.get(player);
	}

	public void setSentMessages(Player player, Integer counter) {
		this.sentMessages.put(player, counter);
	}

	public HashMap<Player, Integer> getSentMessages() {
		return this.sentMessages;
	}

}