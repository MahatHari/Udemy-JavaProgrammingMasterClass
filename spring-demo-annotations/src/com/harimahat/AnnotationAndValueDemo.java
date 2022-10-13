package com.harimahat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationAndValueDemo {
    public static void main(String[] args) {

        // Get spring container or context
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        // get beans
        Coach fileFortune = context.getBean("fCoach", FileFortuneCoach.class);


        System.out.println(fileFortune.getDailyFortune());
        System.out.println(fileFortune.getDailyWorkout());

        context.close();
    }



}
