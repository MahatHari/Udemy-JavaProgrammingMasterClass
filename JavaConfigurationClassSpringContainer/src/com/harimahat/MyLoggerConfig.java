package com.harimahat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLoggerConfig {

    public MyLoggerConfig(String rootLoggerLevel, String printedLoggerLevel){
        Level rootLevel= Level.parse(rootLoggerLevel);
        Level printedLevel= Level.parse(printedLoggerLevel);


        // get logger for app context
        Logger applicationContextLogger= Logger.getLogger(AnnotationConfigApplicationContext.class.getName());

        // get parent logger
        Logger loggerParent= applicationContextLogger.getParent();

        //set root logging level
        loggerParent.setLevel(rootLevel);

        // set up console Handler
        ConsoleHandler consoleHandler= new ConsoleHandler();
        consoleHandler.setLevel(printedLevel);
        consoleHandler.setFormatter(new SimpleFormatter());

        // add handler to logger

        loggerParent.addHandler(consoleHandler);


    }
}
