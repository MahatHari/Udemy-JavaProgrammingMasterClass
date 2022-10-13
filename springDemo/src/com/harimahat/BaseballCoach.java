package com.harimahat;

public class BaseballCoach implements Coach{

    private FortuneService hisFortune;

    public  BaseballCoach(FortuneService theFortune){
        hisFortune=theFortune;
    }

    @Override
    public String getDailyWorkOut() {
        return "Get some Driibling";
    }

    @Override
    public String getDailyFortune() {
        return hisFortune.getFortuneCookie();
    }
}
