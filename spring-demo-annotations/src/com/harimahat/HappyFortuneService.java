package com.harimahat;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getDailyFortune() {
        return "Your are lucky Today";
    }
}
