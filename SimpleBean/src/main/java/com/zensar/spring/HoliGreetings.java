package com.zensar.spring;

/*
 * Author: Pickle Rick
 * Creation Date: 27th July 2019 12.56 PM
 * Modified Date: 27th July 2019 01.50 PM
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is a specialized greetings used to greet anybody
 * on Holi.
 * 
 * That's all folks.   
 * */

public class HoliGreetings implements Greetings {

	public HoliGreetings() {
		// TODO Auto-generated constructor stub
		System.out.println("Holi Greetings Created");
	}
	
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Holi, Raghubira";
	}

}
