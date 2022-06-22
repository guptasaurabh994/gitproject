package com.rabhcode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");//tells the spring to scan for bean
		//get the bean from container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
      context.close();
	}

}
