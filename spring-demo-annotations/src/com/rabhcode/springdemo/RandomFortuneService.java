package com.rabhcode.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
//create an array of string
	
	private String[] data= {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	//random number generator
	private Random myRandom =new Random();
	
	
	@Override
	public String getFortune() {
		// pick random work from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		return theFortune;
	}

}
