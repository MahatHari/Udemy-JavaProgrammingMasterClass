package com.harimahat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
// Default @Scope is singleton
 @Scope("prototype")
public class TennisCoach implements Coach{
    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(@Qualifier("RESTFortuneService") FortuneService randomFortuneService){
        System.out.println("TennisCoach: inside arg constructor");
        this.fortuneService=randomFortuneService;
    }

    @Override
    public String getDailyFortune() {
        return "Tennis Coach Random: "+ fortuneService.getDailyFortune();
    }

    @Override
    public String getDailyWorkout(){
        return "Practice your backhand volley";
    }

}
