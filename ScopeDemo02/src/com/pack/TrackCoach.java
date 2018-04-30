package com.pack;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}	
	//add an init method
		public void doMyStartupStuff() {
			System.out.println("TrackCoach: inside method doMyStuff");
		}
	//add a destroy method
		public void doMyCleanupStuffYOYO(){
			System.out.println("TrackCoach: inside method doMyCleanupStuffYOYO");
		}
	

}
