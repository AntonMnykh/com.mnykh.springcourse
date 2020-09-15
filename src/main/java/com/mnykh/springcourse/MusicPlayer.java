package com.mnykh.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Now is playing: " + music.getSong());
    }
}
