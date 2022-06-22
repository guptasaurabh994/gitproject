package com.rabhcode.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
	//retrieve bean from spring container
Coach theCoach=context.getBean("myCoach",Coach.class);

Coach alphaCoach=context.getBean("myCoach",Coach.class);
//check if same or not
boolean result =(theCoach==alphaCoach);
System.out.println("\n pointing to the same object :" + result);

System.out.println("\n memory location fro theCoach :" +theCoach);

System.out.println("\n memory location fro theCoach :" +alphaCoach);

context.close();
	}
	

}
