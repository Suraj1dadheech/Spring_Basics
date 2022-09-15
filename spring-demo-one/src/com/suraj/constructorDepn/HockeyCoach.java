package com.suraj.constructorDepn;

public class HockeyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public HockeyCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Hockey is the national Game";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
