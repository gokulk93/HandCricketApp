package com.gk.games.handCricket.app.entities;

public class Player {
	private String name;
	private int totalScore;

	public Player() {
		super();
	}

	public Player(String name, int totalScore) {
		super();
		this.name = name;
		this.totalScore = totalScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
}
