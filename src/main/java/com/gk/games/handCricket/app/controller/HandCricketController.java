package com.gk.games.handCricket.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.games.handCricket.app.service.CoinFlipping;
import com.gk.games.handCricket.app.service.HandCricketGame;

@RestController
@RequestMapping(value="/handCricket")
@CrossOrigin(origins="http://localhost:4200")
public class HandCricketController {
	
	@Autowired
	private HandCricketGame handCricket;
	
	@Autowired
	private CoinFlipping tossCoin;
	
	
	@GetMapping(value="/putToss/{playerOneName}/{playerTwoName}")
	public String chooseFirstPlay(@PathVariable String playerOneName, @PathVariable String playerTwoName){
		return tossCoin.getFirstBatting(playerOneName, playerTwoName);
	}
	
	@GetMapping(value="/autoPlay")
	public int callSystemPlay(){
		return handCricket.autoPlay();
	}
	
	@GetMapping(value="/playGame/{playerOneName}/{playerTwoName}")
	public String getScore(@PathVariable String playerOneName, @PathVariable String playerTwoName){
		System.out.println(playerOneName+" "+ playerTwoName);
		String winnerName = handCricket.startMatch(playerOneName, playerTwoName);
		System.out.println("Winner : " +winnerName);
		return winnerName;
	}
	
	@GetMapping(value="/bat/{run}")
	public String getScore(@PathVariable int run){
		
		return null;
	}
	

}
