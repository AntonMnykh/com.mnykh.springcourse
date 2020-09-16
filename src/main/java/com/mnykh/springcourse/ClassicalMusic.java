package com.mnykh.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    @PostConstruct
    public void init(){
        System.out.println("Initialization");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Destruction");
    }

    public List<String> songsList = new ArrayList<>();

    {
        songsList.add("Classical song #1");
        songsList.add("Classical song #2");
        songsList.add("Classical song #3");
    }

    @Override
    public List<String> getSongs() {
        return songsList;
    }
}
