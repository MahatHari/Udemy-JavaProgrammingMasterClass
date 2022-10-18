package com.harimahat;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortuneCookie() {
        return "This is Fortune Cookie";
    }
}
