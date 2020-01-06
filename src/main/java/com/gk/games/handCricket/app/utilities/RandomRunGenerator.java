package com.gk.games.handCricket.app.utilities;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RandomRunGenerator {
	private Random randomRun = new Random();
	private int run=0;
	
	public int generateRun(){
		run = randomRun.nextInt(7);
		if(run==5) generateRun();
		return run;
	}
	
}
