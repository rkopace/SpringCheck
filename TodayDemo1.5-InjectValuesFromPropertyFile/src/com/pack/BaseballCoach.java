package com.pack;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortune) {
		fortuneService = theFortune;
	}
	
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {	
		return fortuneService.getDailyFortune();
	}
}
