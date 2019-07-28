package com.zensar.spring.performers;

/*
 * Author: Pickle Rick
 * Creation Date: 27th July 2019 16.22
 * Modified Date: 27th July 2019 16.22
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It is used to represent juggler.
 * Juggler gets bean bags using constructor injection
 * That's all folks.   
 * */


public class Juggler implements Performer {

	private int beanBags;
	
	public Juggler() {
		// TODO Auto-generated constructor stub
		System.out.println("No Arg. Constructor of Juggler");
		
	}
	
	
	
	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("Param Constructor of Juggler");
	}



	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Juggler juggling "+ beanBags);
	}

}
