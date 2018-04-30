package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//Load String Configuration File - create Spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive Bean from the container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		//Call methods on the Bean
		boolean result = (theCoach == alphaCoach);
		System.out.println("\n Pointing to the same object: " + result);
		System.out.println("\n Memory location for theCoach: " + theCoach);
		System.out.println("\n Memory location for alphaCoach" + alphaCoach + "\n");
		
		//Close context
		context.close();
	}

}
