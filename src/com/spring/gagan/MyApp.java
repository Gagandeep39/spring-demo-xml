package com.spring.gagan;

public class MyApp {

	/**
	 * Created using Spring 5.0.7
	 * @return void
	 */
	public static void main(String[] args) {
		
//		BaseballCoach coach = new BaseballCoach();
//		System.out.println(coach.getDailyWorkout());
		
		/**
		 * Using a generic object 
		 * Coding to interface
		 */
		Coach coach = new BaseballCoach();
		System.out.println(coach.getDailyWorkout());
		
		Coach coach2 = new TrackCoach();
		System.out.println(coach2.getDailyWorkout());
		
		/**
		 * Inversion control
		 * Outsourcing object creation
		 * Done suing an XML configuration fule
		 * 
		 * Dependency Injecton
		 * Provide dependencies to an Object
		 */
	}
}
