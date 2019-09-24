package ru.chams.springcources;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class RapMusic implements Music {

    private List<String> rapList;

    public RapMusic() {
        rapList = new ArrayList<>();
        rapList.add("eminem");
        rapList.add("mnogotochie");
        rapList.add("anacondaz");
    }

    @Override
    public String getSong() {
        return "yo";
    }

    public List<String> getRapMusicList() {
        return rapList;
    }
}