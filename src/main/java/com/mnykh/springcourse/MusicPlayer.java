package com.mnykh.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("electronicMusic") Music music2,
                       @Qualifier("classicalMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public String playMusic(Genre genre){
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if(genre == Genre.CLASSICAL){
            return "Now is playing: " + music3.getSongs().get(randomNumber);
        }
        else if (genre == Genre.ELECTRONIC){
            return "Now is playing: " + music2.getSongs().get(randomNumber);
        } else {
            return "Now is playing: " + music1.getSongs().get(randomNumber);
        }
    }
}
