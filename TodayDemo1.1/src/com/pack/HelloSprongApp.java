package com.pack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSprongApp {

	public static void main(String[] args) {
		
		//Load Spring configuration file - create Spring container
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive bean from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//Call bean methods
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();

	}

}
