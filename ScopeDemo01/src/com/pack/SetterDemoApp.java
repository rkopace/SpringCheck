package com.pack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {
		
			//Load Spring configuration file - create Spring container
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			
			//Retrive bean from Spring configuration
			CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
			
			//Call methods on the bean
			System.out.println(theCricketCoach.getDailyFortune());
			System.out.println(theCricketCoach.getDailyWorkout());
			
			System.out.println(theCricketCoach.getEmailAddress());
			System.out.println(theCricketCoach.getTeam());
			
			//Close context
			context.close();
		}

	}
