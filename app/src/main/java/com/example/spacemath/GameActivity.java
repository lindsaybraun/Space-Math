package com.example.spacemath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_game);

        questionNumView = (TextView)findViewById(R.id.question_num_text);
        questionView = (TextView)findViewById(R.id.question);
        buttonChoice1 = (Button)findViewById(R.id.choice1);
        buttonChoice2 = (Button)findViewById(R.id.choice2);
        buttonChoice3 = (Button)findViewById(R.id.choice3);

        //Start of Button Listener for Button1
        buttonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (buttonChoice1.getText() == answer){
                    questionNum = questionNum + 1;
                    updateScore();
                    updateQuestion();
                    //This line of code is optional
                    Toast.makeText(GameActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(GameActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
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
                    questionNum = questionNum + 1;
                    updateScore();
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(GameActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(GameActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
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
                    questionNum = questionNum + 1;
                    updateScore();
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText(GameActivity.this, "correct", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(GameActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        //End of Button Listener for Button3





    }

    private void updateQuestion(){
        questionView.setText(questionLibrary.getQuestion(questionNum));
        buttonChoice1.setText(questionLibrary.getChoice1(questionNum));
        buttonChoice2.setText(questionLibrary.getChoice2(questionNum));
        buttonChoice3.setText(questionLibrary.getChoice3(questionNum));

        answer = questionLibrary.getCorrectAnswer(questionNum);
    }


    private void updateScore() {
        questionNumView.setText("" + questionNum);
    }
}
