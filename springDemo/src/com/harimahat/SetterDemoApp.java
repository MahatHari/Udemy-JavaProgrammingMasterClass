package com.harimahat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from container
        CricketCoach cricketCoach= context.getBean("circketCoach", CricketCoach.class);

        // call methods on bean
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyWorkOut());

        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeam());


        // close context
        context.close();
    }
}
