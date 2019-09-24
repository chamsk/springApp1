package ru.chams.springcources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    //private List<Music> musicList;
    @Value("${musicPlayer.name}") //берем значения из файла .properties
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private RapMusic rapMusic;
    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    @PostConstruct
    public void initMethod(){
        System.out.println("init");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("destroy");
    }

    public  void playMusic(MusicEnum musicEnum){
        Random random = new Random();
        switch (musicEnum){
            case CLASSICAL :
                List<String> rockMusicList = rockMusic.getRockList();
                System.out.println(rockMusicList.get(random.nextInt(3)));
                break;
            case RAP:
                List<String> rapMusicList = rapMusic.getRapMusicList();
                System.out.println(rapMusicList.get(random.nextInt(3)));
                break;
            case ROCK:
                List<String> classicList = classicalMusic.getClassicList();
                System.out.println(classicList.get(random.nextInt(3)));
                break;

        }
//        for (Music song:musicList) {
//            System.out.println("Song sound: " + song.getSong());
//        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Autowired
    @Qualifier("rapMusic")
    public void setRapMusic(RapMusic rapMusic) {
        this.rapMusic = rapMusic;
    }

    @Autowired
    @Qualifier("rockMusic")
    public void setRockMusic(RockMusic rockMusic) {
        this.rockMusic = rockMusic;
    }
    @Autowired
    @Qualifier("classicalMusic")
    public void setClassicalMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }


}