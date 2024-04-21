package com.kohan81.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    @Autowired//третий способ внедрения зависимости, в таком случае ни конструктор, ни метод, ничего не нужно
    private Music music;

    //IoC
//    //@Autowired первый способ внедрения зависимости
//    public MusicPlayer(Music music){
//        this.music = music;
//    }
//
//    //@Autowired второй способ внедрения зависимости - тут аннотация всё решает, всё-равно как называется метод
//    public void setMusic(Music music){
//        this.music = music;
//    }

    public void play(){
        System.out.println("Playnig: " + music.getSong());
    }
}
