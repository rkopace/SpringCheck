package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//Load Spring configuration file - create Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive bean from Spring configuration
		CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//Call methods on the bean
		System.out.println(myCricketCoach.getDailyFortune());
		System.out.println(myCricketCoach.getDailyWorkout());
			//call our new methods to get the literal values
		System.out.println(myCricketCoach.getEmailAddress());
		System.out.println(myCricketCoach.getTeam());
		
		//Close context
		context.close();
	}

}
