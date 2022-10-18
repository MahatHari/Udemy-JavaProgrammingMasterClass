package com.harimahat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {

        //Load the spring configuration file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach= context.getBean("myCoach", Coach.class);
        Coach hisCoach= context.getBean("hisCoach", Coach.class);
        // call methods on bean
        System.out.println(theCoach.getDailyWorkOut());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(hisCoach.getDailyWorkOut());
        System.out.println(hisCoach.getDailyFortune());

        // close context
        context.close();

    }
}
