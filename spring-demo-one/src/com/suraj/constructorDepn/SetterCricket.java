package com.suraj.constructorDepn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterCricket {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("************************Dependency Injection*************************************");
		Coach theCoach2 = context.getBean("cricketCoach",Coach.class);
		
		System.out.println(theCoach2.getDailyFortune());
		
		context.close();

	}

}
