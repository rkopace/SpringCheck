package com.pack;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "This is your lucky day";
	}

}
