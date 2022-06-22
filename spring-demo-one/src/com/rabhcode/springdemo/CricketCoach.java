package com.rabhcode.springdemo;

public class CricketCoach implements Coach {
private FortuneService fortuneService;
//add new fields for email and  team
private String emailAddress;
private String team;
	
public String getEmailAddress() {
	return emailAddress;
}
public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
	System.out.println("CricketCoach : inside no setter method- setEmailAddress");
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
// create no default constructor
public CricketCoach() {
	System.out.println("CricketCoach : inside no arg counstructor");
}
// our setter method called while dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside no setter method - setFortuneService");
		this.fortuneService = fortuneService;
}

	@Override
	public String getDailyWorkout() {
		
		return "practice fast bowling for 15 mins a day";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
