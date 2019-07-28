package com.zensar.spring.performers;

import com.zensar.spring.instruments.Instrument;

/*
 * Author: Pickle Rick
 * Creation Date: 27th July 2019 17.33
 * Modified Date: 27th July 2019 17.33 
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description:Its is used to represent instrumentalist.
 * That's all folks.   
 * */

public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;
	
	
	//Business Logic of 
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist is playing "+ song);
	}

	//for setter injection
	public void setSong(String song) {
		this.song = song;
		System.out.println("Song is set");
	}

	//for setter injection
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("Instrument is set");
	}
	
	

}
