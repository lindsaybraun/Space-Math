package com.example.spacemath;

import java.io.Serializable;

public class Topic implements Serializable {

    private int topicId;
    private String lesson;
    private String topicName;
    private String topicIntro;
    private String topicContent;
    private String topicSummary;
    private String videoURL;

    public Topic(int topicId, String lesson, String topicName, String topicIntro, String topicContent, String topicSummary, String videoURL){
        this.topicId = topicId;
        this.lesson = lesson;
        this.topicName = topicName;
        this.topicIntro = topicIntro;
        this.topicContent = topicContent;
        this.topicSummary = topicSummary;
        this.videoURL = videoURL;
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
}
