package com.example.spacemath;

import java.io.Serializable;

//topic item for lessons
public class Topic implements Serializable {

    private int topicId;
    private String lesson;
    private String topicName;
    private String topicIntro;
    private String topicContent;
    private String topicSummary;
    private String videoURL;
    private int topicImage;

    public Topic(int topicId, String lesson, String topicName, String topicIntro, String topicContent, String topicSummary, String videoURL, int topicImage){
        this.topicId = topicId;
        this.lesson = lesson;
        this.topicName = topicName;
        this.topicIntro = topicIntro;
        this.topicContent = topicContent;
        this.topicSummary = topicSummary;
        this.videoURL = videoURL;
        this.topicImage = topicImage;
    }

    public int getTopicId(){
        return topicId;
    }

    public String getLesson(){
        return lesson;
    }

    public String getTopicName() {
        return topicName;
    }

    public String getTopicIntro() {
        return topicIntro;
    }

    public String getTopicContent() {
        return topicContent;
    }

    public String getTopicSummary() {
        return topicSummary;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public int getTopicImage(){return topicImage;}
}
