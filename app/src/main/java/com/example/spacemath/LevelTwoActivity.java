package com.example.spacemath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LevelTwoActivity extends AppCompatActivity {
    private QuestionLibrary questionLibrary = new QuestionLibrary();

    private TextView questionNumView;
    private TextView questionView;
    private Button buttonChoice1;
    private Button buttonChoice2;
    private Button buttonChoice3;

    private String answer;
    private int questionNum = 0;
    //private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_two);

        questionNumView = (TextView)findViewById(R.id.question_num_text);
        questionView = (TextView)findViewById(R.id.question);
        buttonChoice1 = (Button)findViewById(R.id.choice1);
        buttonChoice2 = (Button)findViewById(R.id.choice2);
        buttonChoice3 = (Button)findViewById(R.id.choice3);

        updateQuestion();

        //Start of Button Listener for Button1
        buttonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (buttonChoice1.getText() == answer){
                    //if reached end of level- 4 being total num of questions per level
                    if (questionNum == 3){
                        Intent i = new Intent(getApplicationContext(),LevelTwoCompleteActivity.class);
                        startActivity(i);
                    }
                    else{
                        questionNum = questionNum + 1;
                        updateQuestionNum();
                        updateQuestion();
                        //This line of code is optional
                        Toast.makeText(LevelTwoActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    }


                }else {
                    Toast.makeText(LevelTwoActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    //updateQuestion();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        buttonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (buttonChoice2.getText() == answer){
                    if (questionNum == 3){
                        Intent i = new Intent(getApplicationContext(),LevelTwoCompleteActivity.class);
                        startActivity(i);
                    }
                    else{
                        questionNum = questionNum + 1;
                        updateQuestionNum();
                        updateQuestion();
                        //This line of code is optional
                        Toast.makeText(LevelTwoActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(LevelTwoActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    //updateQuestion();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        buttonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (buttonChoice3.getText() == answer){
                    if (questionNum == 3){
                        Intent i = new Intent(getApplicationContext(),LevelTwoCompleteActivity.class);
                        startActivity(i);
                    }
                    else{
                        questionNum = questionNum + 1;
                        updateQuestionNum();
                        updateQuestion();
                        //This line of code is optional
                        Toast.makeText(LevelTwoActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(LevelTwoActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    //updateQuestion();
                }
            }
        });

        //End of Button Listener for Button3





    }

    private void updateQuestion(){
        questionView.setText(questionLibrary.getSubtractionQuestion(questionNum));
        buttonChoice1.setText(questionLibrary.getSubtractionChoice1(questionNum));
        buttonChoice2.setText(questionLibrary.getSubtractionChoice2(questionNum));
        buttonChoice3.setText(questionLibrary.getSubtractionChoice3(questionNum));

        answer = questionLibrary.getSubtractionCorrectAnswer(questionNum);
    }


    private void updateQuestionNum() {
        questionNumView.setText("" + String.valueOf(questionNum + 1));
    }

}
