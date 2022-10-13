package com.harimahat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoalFieldInjection implements Coach{
    @Autowired
    @Qualifier("RESTFortuneService")
    private FortuneService fortuneService;

    // Default Constructor, mn
   public VolleyballCoalFieldInjection(){
       System.out.println(">>Volleyball Coach: Default constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Get to beach everyday";
    }

    @Override
    public String getDailyFortune() {
        return "Volleyball Coach : "+fortuneService.getDailyFortune();
    }
}
