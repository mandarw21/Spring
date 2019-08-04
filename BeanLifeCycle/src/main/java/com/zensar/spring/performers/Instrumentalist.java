package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

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

public class Instrumentalist implements Performer,BeanNameAware,BeanFactoryAware,ApplicationContextAware,
InitializingBean,DisposableBean

{

	private String song;
	private Instrument instrument;
	private String beanName;
	
	//Business Logic of 
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist "+ beanName+" is playing "+ song);
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

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName = name;
		System.out.println("Bean name is set");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Spring Core IoC Container BeanFactory is set");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Spring specialized IoC Container ApplicationContext is set");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//instrument.tune();
		System.out.println("after PropertiesSet is called");
	}
	
	public void tuneInstrument() {
		instrument.tune();
		System.out.println("Custom init method");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//instrument.clean();
		System.out.println("Destroy method is called");
	}

	public void cleanInstrument() {
		instrument.clean();
		System.out.println("Custom destroy method");
	}
}
