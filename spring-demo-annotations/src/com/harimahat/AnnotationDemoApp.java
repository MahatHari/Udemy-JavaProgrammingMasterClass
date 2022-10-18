package com.harimahat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        // get the bean from container
        Coach tennisCoach= context.getBean("tennisCoach", Coach.class);

        // get the bean using default Bean IDs,
        Coach golfCoach= context.getBean("golfCoach", Coach.class);

        Coach volleyballCoach= context.getBean("volleyballCoalFieldInjection", Coach.class);

        // SwimCoach Value Injection bean
        Coach swimCoach= context.getBean("swimCoach", Coach.class);

        // call a method on the bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        System.out.println(golfCoach.getDailyWorkout());
        System.out.println(golfCoach.getDailyFortune());


        // VolleyballCoalFieldInjection  has Field Injection
        System.out.println(volleyballCoach.getDailyFortune());
        System.out.println(volleyballCoach.getDailyWorkout());

        // Swim Coach
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
