package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class SpringApp 
{
    public static void main( String[] args )
    {
    	//Spring IoC Object
        ApplicationContext applicationContext = 
        		new ClassPathXmlApplicationContext("greetings.xml");
        
        //obtaining ready made object from Spring IoC Container
        Greetings g1 = applicationContext.getBean("birthday",Greetings.class);
        
        //Invoking the business logic method
        
        System.out.println(g1.sayGreet());
        
      //obtaining ready made object from Spring IoC Container
        Greetings g2 = applicationContext.getBean("holi",Greetings.class);
        
        //Invoking the business logic method
        
        System.out.println(g2.sayGreet());
        
        Greetings g3 = applicationContext.getBean("birthday",Greetings.class);
    }
}
