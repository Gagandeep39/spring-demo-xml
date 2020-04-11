package com.spring.gagan;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String team;
	private String email;
	
	

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside cricket team setter method");
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("Inside cricket email setter emthod");
		this.email = email;
	}

	public CricketCoach() {
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	// Only Setter method is required
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice cricket";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " after you play cricket";
	}

	@Override
	public String toString() {
		return "CricketCoach [fortuneService=" + fortuneService + ", team=" + team + ", email=" + email + "]";
	}
	
	

}
