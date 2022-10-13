package com.harimahat;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService{

    @Override
    public String getDailyFortune() {
        return "Your are getting from Database Today";
    }
}
