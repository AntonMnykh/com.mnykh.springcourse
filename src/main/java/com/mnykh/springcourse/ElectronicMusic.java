package com.mnykh.springcourse;

import org.springframework.stereotype.Component;

//@Component
public class ElectronicMusic implements Music{
    @Override
    public String getSong() {
        return "Invaders must die";
    }
}
