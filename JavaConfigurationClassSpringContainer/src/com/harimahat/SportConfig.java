package com.harimahat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration

@PropertySource("classpath:myLogger.properties")// load property file
public class SportConfig {

    // Define bean for MyLoggerConfig
    @Bean
    public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") final String rootLoogerLevel, @Value("${printed.logger.level}") final String printedLogerLevel){
        MyLoggerConfig myLoggerConfig= new MyLoggerConfig(rootLoogerLevel,printedLogerLevel);
        return myLoggerConfig;
    }

    // Define bean for VolleyballCoach
    @Bean
    public Coach volleyballCoach(){
        VolleyballCoach myVolleyballCoach= new VolleyballCoach();
        return myVolleyballCoach;
    }

    // 1. Define method to Expose a bean
     // 1.a Define bean for our happy fortune service, as it's a dependency of swimCoach
    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }
    // 1.b  Define bean for Swim coach
    @Bean
    public Coach swimCoach(){
        // 2. Inject dependency, passing happyFortuneService bean to SwimCoach bean
        return new SwimCoach(happyFortuneService());
    }

}
