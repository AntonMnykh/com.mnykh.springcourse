package com.mnykh.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ElectronicMusic implements Music{

    private List<String> songsList = new ArrayList<>();

    {
        songsList.add("Electronic song #1");
        songsList.add("Electronic song #2");
        songsList.add("Electronic song #3");
    }

    @Override
    public List<String> getSongs() {
        return songsList;
    }
}
