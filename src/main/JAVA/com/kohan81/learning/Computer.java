package com.kohan81.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 0;
        this.musicPlayer = musicPlayer;
    }

    public String toString(){
        return "Computer " + id + " " + musicPlayer.play();
    }
}
