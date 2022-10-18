package com.harimahat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("swimCoach")
public class SwimCoachValueInjection implements Coach{
    @Value("${swim.email}")
    private String email;
    @Value("${swim.team}")
    private  String team;

    @Autowired
    @Qualifier("randomFortuneService")
    private  FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Send Workout to: "+email;
    }

    @Override
    public String getDailyFortune() {
        return team+ "Fortune: "+ fortuneService.getDailyFortune();
    }
}
