package com.harimahat;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IoCAndDiConfig {


    @Bean
    public SuperHappyFortuneImpl superHappyFortune(){
        return  new SuperHappyFortuneImpl();
    }
    // creat bean
    @Bean
    public BadmintionCoach badmintionCoach(){
      //  return  new BadmintionCoach( superHappyFortune()); // for constructor Injection
        return  new BadmintionCoach();
    }

}
