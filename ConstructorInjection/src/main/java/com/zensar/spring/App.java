package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = 
        		new ClassPathXmlApplicationContext("performers.xml");
        
        
        Performer performer = applicationContext.getBean("Mukesssss",Performer.class);
        performer.perform();
        
        System.out.println();
        
        Performer performer01 = applicationContext.getBean("Reema Mehra",Performer.class);
        performer01.perform();
        
    }
}
