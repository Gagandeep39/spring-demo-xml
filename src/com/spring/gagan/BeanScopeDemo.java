package com.spring.gagan;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach firstCoach = context.getBean("myCoach", Coach.class);
		Coach secondCoach = context.getBean("myCoach", Coach.class);
		
		// Will return true as it is singleton by default
		// Both beans refer to same object in memory
		System.out.println(firstCoach==secondCoach);
		System.out.println(firstCoach);
		System.out.println(secondCoach);
		
		context.close();
		
	}

}
