package com.mnykh.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //@Autowired
    //@Qualifier("rockMusic")
    private List<Music> music = new ArrayList<>();


    @Autowired
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }

    public String playMusic(Genre genre){
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if(genre == Genre.CLASSICAL){
            return "Now is playing: " + music.get(randomNumber).getSongs().get(randomNumber);
        }
        else if (genre == Genre.ELECTRONIC){
            return "Now is playing: " + music.get(randomNumber).getSongs().get(randomNumber);
        } else {
            return "Now is playing: " + music.get(randomNumber).getSongs().get(randomNumber);
        }
    }
}
