package com.rabhcode.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")//used to generate random objects
public class TennisCoach implements Coach {

	@Autowired //dependency injection happens directly using ava tech called reflection//field injection
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	//define default constructor
	
	public TennisCoach()
	{
		System.out.println(">> TennisCoach: Inside default constructor");
	}
	
	// define init method
	
//	
	
//	//define destroy method
//	public void doMyCleanupStuff() {
//		System.out.println(">> TennisCoach : inside of doMyCleanupStuff method ");
//	}
	
	//defie a setter method//dependency injection using setter-method//setter injection
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside the method : doSomeCrazyStuff");
		fortuneService = theFortuneService;
	}
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {//this commented code is dependency injection using constructor uncomment to use it
		fortuneService = theFortuneService;//constructor injection
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volly";
	}

	

	@Override
	public String getDailyFortune() {	
		return fortuneService.getFortune();
	}

}
