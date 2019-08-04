package com.zensar.spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
    	ApplicationContext ctx = 
        		new ClassPathXmlApplicationContext("performers.xml");
        
        Performer performer = ctx.getBean("Tina J",Performer.class);
        performer.perform();
        
        
        ConfigurableApplicationContext cfgCtx = (ConfigurableApplicationContext) ctx;
        
        //Shutting down spring IoC Container
        cfgCtx.close();
    }
}
