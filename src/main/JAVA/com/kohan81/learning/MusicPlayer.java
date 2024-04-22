package com.kohan81.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private final Music music1;
    private final Music music2;

    @Autowired
    private MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2){
        this.music1 = music1;
        this.music2 = music2;
    }

    public String play(Genre genre){

        if (genre==Genre.ROCK) {
            return "Playing: " + music1.getSong();
        } else

    return "Playing: " + music2.getSong();


//        return "Playnig: " + music1.getSong() + ",\n " + music2.getSong();
    }
}
