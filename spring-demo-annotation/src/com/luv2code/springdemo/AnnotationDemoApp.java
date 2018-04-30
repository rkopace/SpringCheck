package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();

	}

}
