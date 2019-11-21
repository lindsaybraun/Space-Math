package com.example.spacemath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Random;


public class LevelThreeActivity extends AppCompatActivity {

    private QuestionLibrary questionLibrary = new QuestionLibrary();

    private TextView questionNumView;
    private TextView questionView;
    private Button buttonChoice1;
    private Button buttonChoice2;
    private Button buttonChoice3;

    private Button quitButton;
    private ArrayList<Integer> randomQuestions;


    private String answer;
    private int questionNum = 0;
    //private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_three);

        questionNumView = (TextView)findViewById(R.id.question_num_text);
        questionView = (TextView)findViewById(R.id.question);
        buttonChoice1 = (Button)findViewById(R.id.choice1);
        buttonChoice2 = (Button)findViewById(R.id.choice2);
        buttonChoice3 = (Button)findViewById(R.id.choice3);

        quitButton = (Button)findViewById(R.id.quit);

        randomQuestions = getRandomNonRepeatingIntegers(3,0,8);


        updateQuestion();

        //Start of Button Listener for Button1
        buttonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (buttonChoice1.getText() == answer){
                    //if reached end of level- 4 being total num of questions per level

                    if (questionNum == 2){
                        Intent i = new Intent(getApplicationContext(),LevelThreeCompleteActivity.class);
                        startActivity(i);
                    }
                    else{
                        questionNum = questionNum + 1;
                        updateQuestionNum();
                        updateQuestion();
                        //This line of code is optional
                        Toast.makeText(LevelThreeActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    }


                }else {
                    Intent i = new Intent(getApplicationContext(),IncorrectAnswerActivity.class);
                    startActivity(i);
                    //maybe: either have a certain number of lives or exit game when wrong
                    Toast.makeText(LevelThreeActivity.this, "wrong", Toast.LENGTH_SHORT).show();
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
                    if (questionNum == 2){
                        Intent i = new Intent(getApplicationContext(),LevelThreeCompleteActivity.class);
                        startActivity(i);
                    }
                    else{
                        questionNum = questionNum + 1;
                        updateQuestionNum();
                        updateQuestion();
                        //This line of code is optional
                        Toast.makeText(LevelThreeActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Intent i = new Intent(getApplicationContext(),IncorrectAnswerActivity.class);
                    startActivity(i);
                    //maybe: either have a certain number of lives or exit game when wrong
                    Toast.makeText(LevelThreeActivity.this, "wrong", Toast.LENGTH_SHORT).show();
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
                    if (questionNum == 2){
                        Intent i = new Intent(getApplicationContext(),LevelThreeCompleteActivity.class);
                        startActivity(i);
                    }
                    else{
                        questionNum = questionNum + 1;
                        updateQuestionNum();
                        updateQuestion();
                        //This line of code is optional
                        Toast.makeText(LevelThreeActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Intent i = new Intent(getApplicationContext(),IncorrectAnswerActivity.class);
                    startActivity(i);
                    //maybe: either have a certain number of lives or exit game when wrong
                    Toast.makeText(LevelThreeActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //End of Button Listener for Button3

        quitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });





    }

    private void updateQuestion(){
        questionView.setText(questionLibrary.getMultiplicationQuestions(randomQuestions.get(questionNum)));
        buttonChoice1.setText(questionLibrary.getMultiplicationChoice1(randomQuestions.get(questionNum)));
        buttonChoice2.setText(questionLibrary.getMultiplicationChoice2(randomQuestions.get(questionNum)));
        buttonChoice3.setText(questionLibrary.getMultiplicationChoice3(randomQuestions.get(questionNum)));

        answer = questionLibrary.getMultiplicationCorrectAnswer(randomQuestions.get(questionNum));
    }


    private void updateQuestionNum() {
        questionNumView.setText("" + String.valueOf(questionNum + 1));
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static ArrayList<Integer> getRandomNonRepeatingIntegers(int size, int min,
                                                                   int max) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (numbers.size() < size) {
            int random = getRandomNumberInRange(min, max);

            if (!numbers.contains(random)) {
                numbers.add(random);
            }
        }

        return numbers;
    }

}


