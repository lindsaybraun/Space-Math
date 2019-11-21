package com.example.spacemath;

import java.io.Serializable;

// item for learn section- includes title and image
public class LearnItem implements Serializable {

    private int imageResource;
    private String lesson;


    public LearnItem(String lesson, int imageResource) {
        this.lesson = lesson;
        this.imageResource = imageResource;

    }

    public int getImageResource() {
        return imageResource;
    }

    public String getLesson() {
        return lesson;
    }


}
