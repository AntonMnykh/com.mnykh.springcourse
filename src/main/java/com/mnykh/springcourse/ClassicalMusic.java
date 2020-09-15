package com.mnykh.springcourse;

public class ClassicalMusic implements Music{

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void init() {
        System.out.println("Bean Initialization");
    }

    public void destroy() {
        System.out.println("Bean Destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
