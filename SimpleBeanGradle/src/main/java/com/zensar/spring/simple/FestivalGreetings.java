package com.zensar.spring.simple;

public class FestivalGreetings implements Greetings {

	public FestivalGreetings() {
		// TODO Auto-generated constructor stub
		System.out.println("Festival Greetings Created");
	}
	
	@Override
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Shivratri";
	}

}
