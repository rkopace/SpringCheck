package com.pack;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
	
	
	
}
