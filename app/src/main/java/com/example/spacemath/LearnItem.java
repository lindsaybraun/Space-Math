package com.example.spacemath;

import java.io.Serializable;

public class LearnItem implements Serializable {

    private int imageResource;
    private String lesson;
    private String topic1;
    private String topic2;
    private String topic3;
    private String topic4;
    private int imageTopic1;
    private int imageTopic2;
    private int imageTopic3;
    private int imageTopic4;

    public LearnItem(String lesson, int imageResource, String topic1, String topic2, String topic3, String topic4) {
        this.lesson = lesson;
        this.imageResource = imageResource;
        this.topic1 = topic1;
        this.topic2 = topic2;
        this.topic3 = topic3;
        this.topic4 = topic4;
    }


    public LearnItem(String lesson, int imageResource, String topic1, int imageTopic1, String topic2, int imageTopic2, String topic3,int imageTopic3, String topic4, int imageTopic4){
        this.lesson= lesson;
        this.imageResource = imageResource;
        this.topic1 = topic1;
        this.topic2 = topic2;
        this.topic3 = topic3;
        this.topic4 = topic4;
        this.imageTopic1 = imageTopic1;
        this.imageTopic2 = imageTopic2;
        this.imageTopic3 = imageTopic3;
        this.imageTopic4 = imageTopic4;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getLesson() {
        return lesson;
    }

    public String getTopic1(){
        return topic1;
    }
    public String getTopic2(){
        return topic2;
    }
    public String getTopic3(){
        return topic3;
    }
    public String getTopic4(){
        return topic4;
    }


    public int getImageTopic1() {
        return imageTopic1;
    }

    public int getImageTopic2() {
        return imageTopic2;
    }

    public int getImageTopic3() {
        return imageTopic3;
    }

    public int getImageTopic4() {
        return imageTopic4;
    }
}
