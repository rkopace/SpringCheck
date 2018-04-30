package com.pack;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("CricketCoach - default constructor. It`s mandatory.");
	}
	
	public CricketCoach(FortuneService theFortuneService) {
		System.out.println("CricketCoach constructor with param");
		fortuneService = theFortuneService;	
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	
	
	
}
