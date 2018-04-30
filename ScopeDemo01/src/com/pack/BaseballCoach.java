package com.pack;


public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
}
