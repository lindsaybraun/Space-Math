package com.example.spacemath;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LearnAdapter extends RecyclerView.Adapter<LearnAdapter.ViewHolder>   {
    public ArrayList<LearnItem> lessons;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageResource;
        public TextView lessonTitle;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageResource = itemView.findViewById(R.id.lessonImage);
            lessonTitle = itemView.findViewById(R.id.tv_lesson);

        }
    }

    public LearnAdapter(ArrayList<LearnItem> lessons) {
        this.lessons = lessons;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.learn_item, parent, false);
        ViewHolder viewHolder =  new ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        //set image and lesson title
        final LearnItem currentItem = lessons.get(position);
        holder.imageResource.setImageResource(currentItem.getImageResource());
        holder.lessonTitle.setText(currentItem.getLesson());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, LearnDetailActivity.class);
                intent.putExtra("LearnItem", currentItem);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {

        return lessons.size();
    }


}




