package com.example.spacemath;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


public class GameHomeFragment extends Fragment {
    private Button startButton;

    public GameHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_game_home, container, false);
        startButton = (Button) view.findViewById(R.id.startGameButton);

        //Start of Button Listener for Button1
        startButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                Intent i = new Intent(getContext(),GameActivity.class);
                startActivity(i);
            }
        });
        // Inflate the layout for this fragment

//        ArrayList<Question> additionQues = new ArrayList<>();
//        additionQues.add(new Question("24 + 17 =","31", "48", "41","41"));
//        additionQues.add(new Question("32 + 13 =", "35", "45", "55", "45"));
//        additionQues.add(new Question("16 + 20 =", "36", "32", "26" , "36"));
//        additionQues.add(new Question("63 + 25 =", "77", "87", "88", "88"));
//        additionQues.add(new Question("5 + 2 =","7", "10", "9", "7"));
//        additionQues.add(new Question("46 + 10 =", "36","56", "55", "56"));
//        additionQues.add(new Question("27 + 49 =","72","76", "71", "76"));
//        additionQues.add(new Question("25 + 39 =","62","58","64","64"));
//        additionQues.add(new Question("62 + 18 =","75","80","69", "80"));
//

        return view;


    }

//    public Question getQuestion(){
//
//        int min = 0;
//        int max = .length;
//        int a = (int)(Math.random()*(max-min)+1)+min;
//    }


}
