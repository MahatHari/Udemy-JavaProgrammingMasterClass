package com.harimahat;

public class CricketCoach implements Coach{
    private  FortuneService cricketFortune;
    private String emailAddress;
    private String team;
    public CricketCoach(){
        System.out.println("CricketCoach: inside no arg Constructor");
    };

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling";
    }



    // our setter method
    public void setCricketFortune(FortuneService cricketFortune) {
        System.out.println("Inside setter method");
        this.cricketFortune = cricketFortune;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Cricket Coach: Inside email Setter method");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricket Coach: Inside Team Setter method");
        this.team = team;
    }

    @Override
    public String getDailyFortune() {
        return cricketFortune.getFortuneCookie()+ " Get your Century";
    }
}
