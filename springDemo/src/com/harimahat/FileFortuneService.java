package com.harimahat;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class FileFortuneService implements FortuneService {

    private List<String> fortunes;
    private Random random= new Random();

    // Constructor, used to pass fileName from spring config
    public FileFortuneService(String fileName) throws IOException{
        fortunes=loadFortunes(fileName);
    }
    private List<String> loadFortunes(String fileName) throws  IOException{
        Path path= Paths.get(fileName);
        System.out.println(path.toAbsolutePath());
        System.out.println("Reading data from:"+path);
        List<String> data= java.nio.file.Files.readAllLines(path, StandardCharsets.UTF_8);
        System.out.println("Data= "+ data);
        return data;
    }
    @Override
    public String getFortuneCookie() {
        int index= random.nextInt(fortunes.size());
        System.out.println(index);
        String fortune = fortunes.get(index);
        return fortune;
    }

}
