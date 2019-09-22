package ru.chams.springcources;

import java.util.List;

public class MusicPlayer {
    private List<Music> musicList;
    private String name;
    private int volume;


    //IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public  void playMusic(){
        for (Music song:musicList) {
            System.out.println("Song sound: " + song.getSong());
        }

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
}