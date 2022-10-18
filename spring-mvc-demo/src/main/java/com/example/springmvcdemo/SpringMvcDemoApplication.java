package com.example.springmvcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcDemoApplication  {

//    @Override
    // extends SpringBootServletInitializer
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//        return builder.sources(SpringMvcDemoApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcDemoApplication.class, args);
    }
}
