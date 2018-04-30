package com.pack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//Load Spring configuration file - create Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive bean from Spring container
		Coach theCoach = (Coach) context.getBean("myCoach");
		
		//Call bean methods
	    System.out.println(theCoach.getDailyWorkout());
	    
	    //Close context
	    context.close();

	}

}
