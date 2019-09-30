package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        useBeanFactory();
        useAppContext();
        useBeanDefinition();
    }

    private static void useAppContext() {
        System.out.println("Using ApplicationContext");
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
                "beans.xml");
        Movie movie = (Movie) appContext.getBean("movie");
        System.out.println(movie.getActor());
    }

    private static void useBeanFactory() {
        System.out.println("Using BeanFactory");
        Resource res = new FileSystemResource("src/main/resources/beans.xml");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        Movie movie = (Movie) factory.getBean("movie");
        System.out.println(movie.getActor());
    }

    private static void useBeanDefinition() {
        System.out.println("Using BeanDefinition");
        StaticApplicationContext staticApplicationContext = new StaticApplicationContext();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(staticApplicationContext);
        Resource res = new FileSystemResource("src/main/resources/beans.xml");
        reader.loadBeanDefinitions(res);
    }
}
