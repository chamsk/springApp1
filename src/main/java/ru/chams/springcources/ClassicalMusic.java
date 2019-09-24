package ru.chams.springcources;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> classicList;

     public ClassicalMusic() {
         classicList = new ArrayList<>();
         classicList.add("vivaldi");
         classicList.add("bethoven");
         classicList.add("mocart");
    }



    @Override
    public String getSong() {
        return "Buh";
    }

    public List<String> getClassicList() {
        return classicList;
    }
}