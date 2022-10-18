package com.harimahat;

public class TrackCoach implements Coach{

    //define a private field for dependency
    private FortuneService happyFortuneService;

    // define a constructor for dependency injection
    public TrackCoach(FortuneService theHappyFortuneService) {
            happyFortuneService= theHappyFortuneService;
    }

    @Override
    public String getDailyWorkOut() {
            return "Run for 10K";
    }

    @Override
    public String getDailyFortune() {
        // use fortuneService to get cookie
        return "Track Coach Says "+ happyFortuneService.getFortuneCookie();
    }

    // Adding init-method
    public  void  doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    // Adding   destroy method
    public  void  doMyCleanupStuff(){
        System.out.println("TrackCoach: inside method doMyCleanupStuff");
    }

}
