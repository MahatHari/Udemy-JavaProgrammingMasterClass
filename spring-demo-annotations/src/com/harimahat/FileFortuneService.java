package com.harimahat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService{


    private Random random= new Random();
    private List<String> fortunes;
    @Value("${filename}")
    private String fName;

   /* @Autowired
    public FileFortuneService(@Value("${filename}") final String filename) throws IOException {
        System.out.println("Constructor that takes value Injection");
        fortunes=loadData(filename);
    }*/
    @PostConstruct
    public void readDataFromFile() throws IOException{
        System.out.println("FileFortune Service >>> Loading data from PostConstruct ");
        fortunes=loadData(fName);
    }

    public List<String> loadData(String fName) throws IOException {
        Path path= Paths.get(fName);
        System.out.println(fName);
        System.out.println("Reading data from "+path);
        List<String> data= Files.readAllLines(path, StandardCharsets.UTF_8);
        System.out.println(data);
        return data;
    }

    @Override
    public String getDailyFortune() {
       int index= random.nextInt(fortunes.size());
       return fortunes.get(index);
    }



}
