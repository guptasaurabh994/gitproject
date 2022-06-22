package com.rabhcode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);

		
		//check is same
		boolean result =(theCoach==alphaCoach);
		
		//printout result
		
		System.out.println("\n pointing to the same object : "+result);
		
		System.out.println("\n Memory Location for theCoach : " + theCoach);
		
		System.out.println("\n Memory Location for alphaCoach : " + alphaCoach);
		
		//close the context
		context.close();
	}

}
