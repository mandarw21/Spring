package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

/*
 * Author: Pickle Rick
 * Creation Date: 27th July 2019 16.53
 * Modified Date: 27th July 2019 16.53 
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: More skilled juggler who juggles
 * while reciting a poem.
 * Poem is injected into PoeticJuggler
 * using Constructor Injection
 * That's all folks.   
 * */
//Zensar Idol
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = 
        		new ClassPathXmlApplicationContext("performers.xml");
        
        Performer performer = ctx.getBean("Tina J",Performer.class);
        performer.perform();
    }
}
