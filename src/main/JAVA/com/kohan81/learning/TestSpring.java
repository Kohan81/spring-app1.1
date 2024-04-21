package com.kohan81.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.play();

        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(classicalMusic);

        classicalMusicPlayer.play();

        context.close();
    }
}
