package com.harimahat;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp{

    public static void main(String[] args) {

        // load spring config
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // get bean
        Coach coach= context.getBean("myCoach", Coach.class);

        // use bean
        System.out.println(coach.getDailyWorkOut());

        context.close();
    }
}
