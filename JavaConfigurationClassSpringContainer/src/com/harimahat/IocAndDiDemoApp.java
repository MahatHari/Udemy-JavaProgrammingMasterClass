package com.harimahat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocAndDiDemoApp {
    public static void main(String[] args) {

        // read spring Java config file
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(IoCAndDiConfig.class);

        // get bean
        Coach badmintionCoach= context.getBean("badmintionCoach", Coach.class);

        // use bean
        System.out.println(badmintionCoach.getDailyFortune());
        System.out.println(badmintionCoach.getDailyWorkout());
    }
}
