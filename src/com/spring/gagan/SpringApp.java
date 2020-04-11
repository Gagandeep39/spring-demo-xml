package com.spring.gagan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	
	public static void main(String[] args) {
		
		// Load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// Coading for Interface
		// If we change basketball bean or track bean, different outputs will be produt for same code
		// Retrieve bean from the file
		Coach coach = context.getBean("myCoach", Coach.class);
		
		// Call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		// Method called from srevice
		System.out.println(coach.getDailyFortune());
		
		// close the file 
		context.close();
		
	}

}
