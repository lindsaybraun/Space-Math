package com.example.spacemath;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LearnHomeFragment extends Fragment {


    public RecyclerView recyclerView;
    public LearnAdapter adapter;
    public RecyclerView.LayoutManager layoutManager;

    public LearnHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_learn_home, container, false);


        ArrayList<LearnItem> lessons = new ArrayList<>();
        lessons.add(new LearnItem("Addition", R.drawable.addition));
        lessons.add(new LearnItem("Subtraction", R.drawable.subtraction));
        lessons.add(new LearnItem("Multiplication", R.drawable.multiplication));
        lessons.add(new LearnItem("Division", R.drawable.division));

        recyclerView = view.findViewById(R.id.rv_learn);
        layoutManager = new LinearLayoutManager(view.getContext());
        adapter = new LearnAdapter(lessons);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        return view;

    }

}
