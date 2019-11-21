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

public class LevelFourActivity extends AppCompatActivity {

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_four);

        questionNumView = (TextView)findViewById(R.id.question_num_text);
        questionView = (TextView)findViewById(R.id.question);
        buttonChoice1 = (Button)findViewById(R.id.choice1);
        buttonChoice2 = (Button)findViewById(R.id.choice2);
        buttonChoice3 = (Button)findViewById(R.id.choice3);
        quitButton = (Button)findViewById(R.id.quit);

        //create arraylist of 3 unique random question numbers from range of questions
        randomQuestions = getRandomNonRepeatingIntegers(3,0,8);

        //display initial question
        updateQuestion();

        //Start of Button Listener for Button1
        buttonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // if correct answer chosen
                if (buttonChoice1.getText() == answer){
                    //if reached end of level continue to completion page
                    if (questionNum == 2){
                        Intent i = new Intent(getApplicationContext(),LevelFourCompleteActivity.class);
                        startActivity(i);
                    }
                    //go to next question
                    else{
                        questionNum = questionNum + 1;
                        updateQuestionNum();
                        updateQuestion();
                        Toast.makeText(LevelFourActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    }

                    //if incorrect answer go to incorrect answer page
                }else {
                    Intent i = new Intent(getApplicationContext(),IncorrectAnswerActivity.class);
                    startActivity(i);
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        buttonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // if correct answer chosen
                if (buttonChoice2.getText() == answer){
                    //if reached end of level continue to completion page
                    if (questionNum == 2){
                        Intent i = new Intent(getApplicationContext(),LevelFourCompleteActivity.class);
                        startActivity(i);
                    }
                    //go to next question
                    else{
                        questionNum = questionNum + 1;
                        updateQuestionNum();
                        updateQuestion();
                        Toast.makeText(LevelFourActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    }

                    //if incorrect answer go to incorrect answer page
                }else {
                    Intent i = new Intent(getApplicationContext(),IncorrectAnswerActivity.class);
                    startActivity(i);
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        buttonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                // if correct answer chosen
                if (buttonChoice3.getText() == answer){
                    //if reached end of level continue to completion page
                    if (questionNum == 2){
                        Intent i = new Intent(getApplicationContext(),LevelFourCompleteActivity.class);
                        startActivity(i);
                    }
                    //go to next question
                    else{
                        questionNum = questionNum + 1;
                        updateQuestionNum();
                        updateQuestion();
                        Toast.makeText(LevelFourActivity.this, "correct", Toast.LENGTH_SHORT).show();
                    }

                    //if incorrect answer go to incorrect answer page
                }else {
                    Intent i = new Intent(getApplicationContext(),IncorrectAnswerActivity.class);
                    startActivity(i);
                }
            }
        });

        //End of Button Listener for Button3

        // if quit button clicked return to learn page
        quitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }

    //update to next randomly chosen question
    private void updateQuestion(){
        questionView.setText(questionLibrary.getDivisionQuestions(randomQuestions.get(questionNum)));
        buttonChoice1.setText(questionLibrary.getDivisionChoice1(randomQuestions.get(questionNum)));
        buttonChoice2.setText(questionLibrary.getDivisionChoice2(randomQuestions.get(questionNum)));
        buttonChoice3.setText(questionLibrary.getDivisionChoice3(randomQuestions.get(questionNum)));

        answer = questionLibrary.getDivisionCorrectAnswer(randomQuestions.get(questionNum));

    }

    //update question number displayed
    private void updateQuestionNum() {
        questionNumView.setText("" + String.valueOf(questionNum + 1));
    }

    //generate random number in a range
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    // generate unique random numbers in a range of a certain size
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
