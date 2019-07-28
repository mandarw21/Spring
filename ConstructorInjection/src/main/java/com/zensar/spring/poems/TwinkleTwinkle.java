package com.zensar.spring.poems;

/*
 * Author: Pickle Rick
 * Creation Date: 27th July 2019 17.00
 * Modified Date: 27th July 2019 17.00 
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: It represents a poem.
 * Poem is injected into PoeticJuggler
 * 
 * That's all folks.   
 * */

public class TwinkleTwinkle implements Poem {

	private final static String LINES [] = {
		"Starkle Starkle Little Twink",
		"How I Wonder What You Are",
		"Up Above The Ground So High",
		"Like A Diamond In The Sky"
			
	};
	
	public void recite() {
		// TODO Auto-generated method stub
		for (String string : LINES) {
			System.out.println(string);
		}
	}

}
