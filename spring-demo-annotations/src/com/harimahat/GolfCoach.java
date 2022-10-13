package com.harimahat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*Using Default bean Id, if class name is GolfCoach, id is golfCoach, first letter small*/
@Component
public class GolfCoach implements Coach{

    private FortuneService fortuneService;

//    without AutoWiring and Spring bean
  /*  public GolfCoach(){
        fs= new HappyFortuneService();
    }*/

    // Spring Context, Constructor Injection
   /* @Autowired
    public GolfCoach(FortuneService happyFortuneService){
        fortuneService=happyFortuneService;
    }*/
    // define default Constructor
    public  GolfCoach(){
        System.out.println(">> Golf Coach: inside default constructor");
    }

    // define setter method
    @Autowired
    @Qualifier("happyFortuneService")
    public void setFortuneService(FortuneService theFortuneService){
        System.out.println(">> Golf Coach: inside setFortuneService method");
        fortuneService= theFortuneService;
    }

    @Override
    public String getDailyFortune() {
        return "With method Injection " +fortuneService.getDailyFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Play during summer";
    }
}
