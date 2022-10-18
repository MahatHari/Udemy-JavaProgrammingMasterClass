package com.harimahat;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{
    private FortuneService fortuneService;

    // Inject values from properties file
    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;

    // Constructor Injection
    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        String teamDetails ="Team Name: "+team + "\n Contact Address: "+ email;
        return  teamDetails+ " \n Swim 1000m as warm up.";
    }

    @Override
    public String getDailyFortune(){
        return "Swim Coach:>>> "+ fortuneService.getDailyFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
