package com.suraj.constructorDepn;

import java.util.Random;

public class RandomFortune implements FortuneService {

	String arr[]= {"bad luck Next time!!", "Medium luck you have !!", "you have a good luck!!"};
	@Override
	public String getFortune() {
		Random rand = new Random(); 
		return arr[rand.nextInt(3)];
	}

}
