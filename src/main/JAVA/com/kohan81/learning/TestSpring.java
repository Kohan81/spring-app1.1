package com.kohan81.learning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println("volume is " + player.getVolume());
        System.out.println("player name is: " + player.getName());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic2==classicalMusic1);
        System.out.println(classicalMusic2);
        System.out.println(classicalMusic1);

        context.close();
    }
}
