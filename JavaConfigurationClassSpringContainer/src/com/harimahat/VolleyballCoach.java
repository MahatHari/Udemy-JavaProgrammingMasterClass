package com.harimahat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VolleyballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Java ApplicationContext Config";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
