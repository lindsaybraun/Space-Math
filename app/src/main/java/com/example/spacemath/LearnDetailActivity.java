package com.example.spacemath;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class LearnDetailActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public LearnDetailAdapter adapter;
    public RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_detail);

        //get intent from LearnAdapter
        Intent intent = getIntent();
        final LearnItem learnItem = (LearnItem) intent.getSerializableExtra("LearnItem");

        String lessonType = learnItem.getLesson();

        //create array list of all topics related to current lesson
        ArrayList<Topic> topics = new ArrayList<>();
        for(int i = 0; i< TopicsDatabase.getAllTopics().size(); i++) {
            String topicLesson = TopicsDatabase.getAllTopics().get(i).getLesson();
            if (lessonType.equals(topicLesson)){
                topics.add(TopicsDatabase.getAllTopics().get(i));

            }
        }

        recyclerView = findViewById(R.id.rv_learnDetail);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        adapter = new LearnDetailAdapter(topics);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
