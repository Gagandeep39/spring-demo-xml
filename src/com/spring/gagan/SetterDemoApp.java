package com.spring.gagan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);
		 System.out.println(coach.getDailyFortune());
		 System.out.println(coach.getEmail());
		 System.out.println(coach.getTeam());
		 context.close();
	}

}
