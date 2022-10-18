package com.harimahat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component
public class FileFortuneCoach implements Coach{

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Read more files";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
