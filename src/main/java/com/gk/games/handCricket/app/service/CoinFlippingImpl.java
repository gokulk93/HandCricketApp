package com.gk.games.handCricket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gk.games.handCricket.app.utilities.TossCoin;

@Service
public class CoinFlippingImpl implements CoinFlipping{
	
	@Autowired
	private TossCoin coin;
	
	@Override
	public String getFirstBatting(String playerOneName, String playerTwoName) {
		if(coin.flipping() == 1){
			return playerOneName;
		}else{
			return playerTwoName;
		}
	}

}
