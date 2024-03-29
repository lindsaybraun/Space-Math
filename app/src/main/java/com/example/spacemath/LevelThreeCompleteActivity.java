package com.example.spacemath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//level 3 completion page
public class LevelThreeCompleteActivity extends AppCompatActivity {

    private Button continueButton;
    private Button quitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_three_complete);

        continueButton = (Button) findViewById(R.id.continueButton);
        quitButton = (Button) findViewById(R.id.quitButton);

        //Start of Button Listener for Button1
        continueButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //continue to level 4 questions
                Intent i = new Intent(getApplicationContext(),LevelFourActivity.class);
                startActivity(i);
            }
        });

        quitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //return to learn page
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}
