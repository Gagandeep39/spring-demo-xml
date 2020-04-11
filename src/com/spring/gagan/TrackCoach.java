package com.spring.gagan;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run for as long as you can";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " after running for awhile";
	}
	
	public void initMethod() {
		System.out.println("This is the init method to be executed by bean");
	}
	public void destroyMethod() {
		System.out.println("This is the destroy method to be executed by bean");
	} 

}
