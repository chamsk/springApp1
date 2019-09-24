package ru.chams.springcources;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> rockList;

    public RockMusic() {
        rockList = new ArrayList<>();
        rockList.add("aria");
        rockList.add("korrozia metalla");
        rockList.add("rammstain");
    }


    @Override
    public String getSong() {
        return "Hoy";
    }

    public List<String> getRockList() {
        return rockList;
    }
}