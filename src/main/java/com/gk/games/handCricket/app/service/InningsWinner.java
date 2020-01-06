package com.gk.games.handCricket.app.service;

import org.springframework.stereotype.Service;

import com.gk.games.handCricket.app.entities.Player;

@Service
public class InningsWinner {
	
	public String calculateWinner(Player playerOne, Player playerTwo){
		System.out.println("In Winner -->  "+playerOne.getTotalScore());
		return (playerOne.getTotalScore() > playerTwo.getTotalScore()) ? playerOne.getName() 
				: (playerOne.getTotalScore() < playerTwo.getTotalScore()) ? playerTwo.getName() : "Game Tie";
	}

}
