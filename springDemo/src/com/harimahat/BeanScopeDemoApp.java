package com.harimahat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        // retrieve bean  from spring container
        Coach theCoach= context.getBean("myCoach", TrackCoach.class);
        Coach alphaCoach= context.getBean("myCoach", TrackCoach.class);


        // pointing to same object, when scope is default
        boolean result= theCoach==alphaCoach;
        System.out.println("Pointing to same object: "+ result);
        System.out.println();
        System.out.println();

        System.out.println("Memory location "+theCoach);
        System.out.println("Memory location "+alphaCoach);

        // close context
        context.close();
    }
}
