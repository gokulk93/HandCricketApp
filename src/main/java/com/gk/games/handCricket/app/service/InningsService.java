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
	
	
	public int playGame(){
		int totalScore = 0;
		List<Integer> scoreList = new ArrayList<Integer>();
		
		for(int i=0; i<6; i++){
			playerOne = randomNumber.generateRun();
			playerTwo = randomNumber.generateRun();
			
			if(playerOne == playerTwo){
				System.out.println("OUT");
				scoreList.stream().mapToInt( a -> a).sum();
				
				break;
			}else{
				System.out.println("Bats Man Score : " +playerOne);
				scoreList.add(playerOne);
			}
		}
		totalScore = scoreList.stream().mapToInt( a -> a).sum();
		
		
		System.out.println("Total score:"+totalScore);
		return totalScore;
	}
}
