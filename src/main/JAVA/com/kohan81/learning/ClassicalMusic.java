package com.kohan81.learning;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class ClassicalMusic implements Music{

    @PostConstruct
     void doInitialization(){
        System.out.println("Classical Music is initialized");
    }
    static String [] classicsSongs = {"Mozart music", "Hungarian Rhapsody", "Tchaikovsky music"};
    @Override
    public String getSong() {
        return classicsSongs[(int) (Math.random() * classicsSongs.length)];
    }

    @PreDestroy
    void doDestroy(){
        System.out.println("Classical Music is destroyed");
    }
}
