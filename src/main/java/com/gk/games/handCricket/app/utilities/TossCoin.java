package com.gk.games.handCricket.app.utilities;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class TossCoin {
	
	private Random randomRun = new Random();
	private int result ;
	
	public int flipping(){
		result = randomRun.nextInt(2);
		return result;
	}

}
