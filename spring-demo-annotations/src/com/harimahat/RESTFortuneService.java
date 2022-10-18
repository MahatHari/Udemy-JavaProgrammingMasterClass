package com.harimahat;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{

    @Override
    public String getDailyFortune() {
        return "Your are Getting REST Fortune Today";
    }
}
