package com.pack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getDailyFortune());
		
		System.out.println(theCricketCoach.getEmail());
		System.out.println(theCricketCoach.getTeam());
		
		context.close();
		

	}

}
