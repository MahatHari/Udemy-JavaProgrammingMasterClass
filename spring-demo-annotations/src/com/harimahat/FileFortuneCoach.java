package com.harimahat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component("fCoach")
public class FileFortuneCoach implements Coach{

    @Autowired
    @Qualifier("fileFortuneService")
    private FortuneService fs;

    @Override
    public String getDailyWorkout() {
        return "Read more files";
    }

    @Override
    public String getDailyFortune() {
        return fs.getDailyFortune();
    }
}
