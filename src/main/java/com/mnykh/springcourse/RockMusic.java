package com.mnykh.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{

    private List<String> songsList = new ArrayList<>();

    {
        songsList.add("Rock song #1");
        songsList.add("Rock song #2");
        songsList.add("Rock song #3");
    }

    @Override
    public List<String> getSongs() {
        return songsList;
    }
}
