package com.luv2code.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		//BaseballCoach theCoach = new BaseballCoach();
//		Coach theCoach = (Coach) new BaseballCoach();
		Coach theCoach = (Coach) new TrackCoach();
		
		
		 
		//use the object
		System.out.println(theCoach.getDailyWorkout());

	}

}
