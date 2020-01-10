package com.gk.games.handCricket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.games.handCricket.app.entities.Player;

@Service
public class HandCricketGame {
	
	@Autowired
	private InningsService innings;
	
	@Autowired 
	private InningsWinner inningsWinner;
	
	public int autoPlay(){
		return innings.playGame();
	}
	
	public String startMatch(String playerOneName, String playerTwoName){
		Player playerOne = new Player();
		Player playerTwo = new Player();
		
		playerOne.setName(playerOneName);
		playerTwo.setName(playerTwoName);
		int totalScore1 = innings.playGame();
		int totalScore2 = innings.playGame();
		
		playerOne.setTotalScore(totalScore1);
		playerTwo.setTotalScore(totalScore2);
		System.out.println("Total Score one"+totalScore1);
		System.out.println("Total Score two"+totalScore2);
		System.out.println("Total Score: "+ playerOne.getTotalScore() +" :: " + playerTwo.getTotalScore());
		
		return inningsWinner.calculateWinner(playerOne, playerTwo);
	}

}
