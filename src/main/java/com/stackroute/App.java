package com.stackroute;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        useAppContext();
    }

    private static void useAppContext() {
        System.out.println("Using ApplicationContext");
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
                "beans.xml");
        Movie beanA = (Movie) appContext.getBean("MovieA");
        System.out.println(beanA.getActor());
    }
}
