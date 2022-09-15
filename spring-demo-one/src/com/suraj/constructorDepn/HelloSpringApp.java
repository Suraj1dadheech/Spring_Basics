package com.suraj.constructorDepn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration files
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		// close the context
		
		
		System.out.println("*****************************************************************************************************");
		
		// retrieve Second bean from spring container
		Coach theCoach1 = context.getBean("myCoach1",Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach1.getDailyWorkout());
		
		System.out.println(theCoach1.getDailyFortune());
		// close the context
		
		
		
		context.close();

	}

}
