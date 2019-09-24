package ru.chams.springcources;

import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.util.ArrayList;
import java.util.List;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


       // Music musicBean = context.getBean("musicBean",Music.class);

        MusicPlayer player = context.getBean("musicPlayer",MusicPlayer.class);
//        player.playMusic();
//        System.out.println(player.getName());
//        System.out.println(player.getVolume());

        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);

        player.playMusic(MusicEnum.RAP);
        player.playMusic(MusicEnum.ROCK);
        player.playMusic(MusicEnum.CLASSICAL);

        System.out.println(player.getName());





        context.close();
    }
}