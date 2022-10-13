package com.harimahat;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        //load spring
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean
        Coach theCoach= context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach= context.getBean("tennisCoach", Coach.class);
        // use bean
        boolean result= theCoach==alphaCoach;
        System.out.println("\nPointing to the same object "+result);
        System.out.println("\nMemory location for theCoach "+theCoach);
        System.out.println("\nMemory location for alphaCoach "+theCoach);
        // close context
        context.close();
    }
}
