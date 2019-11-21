package com.example.spacemath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//screen when incorrect answer chosen in game
public class IncorrectAnswerActivity extends AppCompatActivity {

    private Button startOverButton;
    private Button quitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_incorrect_answer);

        startOverButton = (Button) findViewById(R.id.continueButton);
        //Start of Button Listener for Button1
        startOverButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //go to question 1 of level 1
                Intent i = new Intent(getApplicationContext(),GameActivity.class);
                startActivity(i);
            }
        });

        quitButton = (Button) findViewById(R.id.quitButton);


        //when quit pressed return to learn page
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
