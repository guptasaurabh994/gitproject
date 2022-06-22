package com.rabhcode.springdemo;

public class MyApp {

	public static void main(String[] args) {
	//create a object
		Coach theCoach = new TrackCoach();
		
//use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
