package com.example.spacemath;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class LearnDetailActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public LearnDetailAdapter adapter;
    public RecyclerView.LayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_detail);

        Intent intent = getIntent();
        final LearnItem learnItem = (LearnItem) intent.getSerializableExtra("LearnItem");

        String lessonType = learnItem.getLesson();

        ArrayList<Topic> topics = new ArrayList<>();
        for(int i= 0; i<FakeDatabase.getAllTopics().size(); i++) {
            String topicLesson = FakeDatabase.getAllTopics().get(i).getLesson();
            if (lessonType.equals(topicLesson)){
                topics.add(FakeDatabase.getAllTopics().get(i));
                System.out.println(topics.get(i));
            }
        }

        recyclerView = findViewById(R.id.rv_learnDetail);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        adapter = new LearnDetailAdapter(topics);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
