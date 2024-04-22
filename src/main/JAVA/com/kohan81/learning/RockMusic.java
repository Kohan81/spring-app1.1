package com.kohan81.learning;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music {

    String song = "";

    public String [] rockSongs = {"Rock Song", "Wind cries Marry", "Metallica song"};

    @Override
    public String getSong() {
        return rockSongs[new Random().nextInt(3)];
    }
}

