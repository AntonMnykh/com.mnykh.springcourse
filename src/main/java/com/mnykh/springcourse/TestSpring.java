package com.mnykh.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic(Genre.CLASSICAL));
        System.out.println(musicPlayer.playMusic(Genre.ELECTRONIC));
        System.out.println(musicPlayer.playMusic(Genre.ROCK));

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();
    }
}
