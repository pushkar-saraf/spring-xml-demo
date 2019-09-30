package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        useAppContext();
    }

    private static void useAppContext() {
        System.out.println("Using ApplicationContext");
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
                "beans.xml");
        Movie beanA = (Movie) appContext.getBean("MovieA");
        System.out.println(beanA);
    }
}
