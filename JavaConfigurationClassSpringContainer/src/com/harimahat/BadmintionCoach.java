package com.harimahat;

import org.springframework.beans.factory.annotation.Autowired;


public class BadmintionCoach implements Coach{

    // Field Dependency Injection
    @Autowired
    private SuperHappyFortuneImpl superHappyFortune;

    // Dependency Injection using Constructor
    /*
    public BadmintionCoach(SuperHappyFortuneImpl spl) {
    superHappyFortune=spl;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Practice shorthand ";
    }

    @Override
    public String getDailyFortune() {
        return superHappyFortune.getDailyFortune();
    }
}
