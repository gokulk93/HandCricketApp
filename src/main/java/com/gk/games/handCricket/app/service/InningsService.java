package com.gk.games.handCricket.app.service;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.games.handCricket.app.utilities.RandomRunGenerator;

@Service
public class InningsService {
	
	@Autowired
	private RandomRunGenerator randomNumber;
	private int playerOne;
	private int playerTwo;
	private List<Integer> scoreList = new ArrayList<Integer>();
	public int playGame(){
		int totalScore =0;
		
		for(int i=0; i<6; i++){
			playerOne = randomNumber.generateRun();
			playerTwo = randomNumber.generateRun();
			
			if(playerOne == playerTwo){
				System.out.println("OUT");
				totalScore =scoreList.stream().mapToInt( a -> a).sum();
				scoreList.clear();
				break;
			}else{
				System.out.println("Bats Man Score : " +playerOne);
				scoreList.add(playerOne);
			}
		}
		totalScore = scoreList.stream().mapToInt( a -> a).sum();
		scoreList.clear();
		return totalScore;
	}
}
