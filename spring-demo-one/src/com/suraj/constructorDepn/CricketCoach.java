package com.suraj.constructorDepn;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("inside Cricket Constructor");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside Cricket setter Method");
		this.fortuneService = fortuneService;
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		System.out.println(fortuneService.message);
		return fortuneService.getFortune();
	}
	

}
