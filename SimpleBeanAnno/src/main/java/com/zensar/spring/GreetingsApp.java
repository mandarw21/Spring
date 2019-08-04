package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.spring.config.GreetingsConfig;

/**
 * Hello world!
 *
 */
public class GreetingsApp 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(GreetingsConfig.class);
        Greetings greetings = ctx.getBean("anniversaryGreetings",Greetings.class);
        
        System.out.println(greetings.sayGreet());
    }
}
