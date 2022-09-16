package com.suraj.constructorDepn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterCricket {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("************************Dependency Injection*************************************");
		Coach theCoach2 = context.getBean("cricketCoach",Coach.class);
		
		System.out.println(theCoach2.getDailyFortune());
	
		
		System.out.println("************************String Literals*************************************");
		
		CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		
		
		context.close();

	}

}
