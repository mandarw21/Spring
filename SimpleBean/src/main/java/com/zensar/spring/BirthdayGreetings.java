package com.zensar.spring;


/*
 * Author: Pickle Rick
 * Creation Date: 27th July 2019 12.54 PM
 * Modified Date: 27th July 2019 01.50 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is a specialized greetings used to greet anybody
 * on his/her birthday.
 * 
 * That's all folks.   
 * */

public class BirthdayGreetings implements Greetings {

	public BirthdayGreetings() {
		// TODO Auto-generated constructor stub
		System.out.println("Birthday Greetings Created");
	}
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Wish you a very Happy Birthday";
	}

}
