package com.harimahat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        //3. read spring config java class
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
        // 4. Retrieve bean from spring container
        Coach vCoach= context.getBean("volleyballCoach", Coach.class );

        //4. Retrieve bean from spring container
        SwimCoach sCoach= context.getBean("swimCoach", SwimCoach.class);
        //5. Use bean methods (consume bean)
        System.out.println(vCoach.getDailyWorkout());
        System.out.println();

        // Swim Coach has new methods getEmail and getTeam
        System.out.println(sCoach.getDailyFortune());
        System.out.println(sCoach.getDailyWorkout());
        System.out.println("Email: "+ sCoach.getEmail());
        System.out.println("Team: " +sCoach.getTeam());

        context.close();
    }
}
