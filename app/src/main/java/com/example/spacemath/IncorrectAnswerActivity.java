package com.example.spacemath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IncorrectAnswerActivity extends AppCompatActivity {

    private Button startOverButton;
    private Button quitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrect_answer);

        startOverButton = (Button) findViewById(R.id.continueButton);
        //TODO: make sure code works for start over button when questions vary each round
        //Start of Button Listener for Button1
        startOverButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here
                Intent i = new Intent(getApplicationContext(),GameActivity.class);
                startActivity(i);
            }
        });

        quitButton = (Button) findViewById(R.id.quitButton);

        //TODO: maybe edit code once other fragment is created to make sure quit takes you to game fragment
        //Start of Button Listener for Button1
        quitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}
