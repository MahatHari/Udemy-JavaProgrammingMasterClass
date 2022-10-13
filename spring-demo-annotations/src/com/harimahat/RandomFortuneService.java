package com.harimahat;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService{

    @Override
    public String getDailyFortune() {
        return "Your are getting Random fortunes  Today";
    }
}
