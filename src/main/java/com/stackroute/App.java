package com.stackroute;

import com.stackroute.domain.Movie;
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
        Movie beanB = (Movie) appContext.getBean("MovieB");
        System.out.println(beanA == beanB);
    }
}
