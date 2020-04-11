package com.spring.gagan;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {
	}
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 min in playing baseball";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " after playing baseball";
	}

}
