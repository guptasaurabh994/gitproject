package com.rabhcode.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(SportConfig.class);//read the spring config java class
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
