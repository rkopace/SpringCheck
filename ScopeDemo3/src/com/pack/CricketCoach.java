package com.pack;


public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("no-args constructor");
	}
	public CricketCoach(FortuneService fortuneService) {
		System.out.println("constructor of Cricket Coach");
		this.fortuneService = fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter of Cricket Coach");
		this.fortuneService = fortuneService;
	}
	

	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
