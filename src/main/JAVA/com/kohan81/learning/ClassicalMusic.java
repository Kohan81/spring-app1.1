package com.kohan81.learning;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    static String [] classicsSongs = {"Mozart music", "Hungarian Rhapsody", "Tchaikovsky music"};
    @Override
    public String getSong() {
        return classicsSongs[(int) (Math.random() * classicsSongs.length)];
    }
}
