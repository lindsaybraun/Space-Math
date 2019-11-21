package com.example.spacemath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class TopicDetailActivity extends YouTubeBaseActivity {

    public ImageView topicImage;
    public TextView topicTitle;
    public TextView topicIntro;
    public TextView topicContent;
    public TextView topicSummary;
    private Button play;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_detail);

        Intent intent = getIntent();
        final Topic currentTopic = (Topic) intent.getSerializableExtra("Topic");

        topicTitle = findViewById(R.id.tv_topicTitle);
        topicIntro = findViewById(R.id.tv_topicIntro);
        topicContent = findViewById(R.id.tv_topicContent);
        topicSummary = findViewById(R.id.tv_topicSummary);
        topicImage = findViewById(R.id.topicImageDetail);

        topicTitle.setText(currentTopic.getTopicName());
        topicIntro.setText(currentTopic.getTopicIntro());
        topicContent.setText(currentTopic.getTopicContent());
        topicSummary.setText(currentTopic.getTopicSummary());
        topicImage.setImageResource(currentTopic.getTopicImage());


        youTubePlayerView = (YouTubePlayerView)findViewById(R.id.youtubeVid);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo(currentTopic.getVideoURL());
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        play = findViewById(R.id.playButton);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youTubePlayerView.initialize("AIzaSyBEhglmux-UV8N73ohEr-x4ziSFRrAYx38 ",onInitializedListener);
            }
        });

    }
}
