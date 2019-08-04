package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.simple.FestivalGreetings;

public class SpringApp {

	public static void main(String[] args) {
		 
		ApplicationContext ctx = 
	        		new ClassPathXmlApplicationContext("greetings.xml");
		
		FestivalGreetings festivalGreetings = ctx.getBean("bean",FestivalGreetings.class);
		System.out.println(festivalGreetings.sayGreet());
		
	}
}
