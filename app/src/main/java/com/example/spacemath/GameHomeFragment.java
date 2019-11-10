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
        return view;
    }


}
