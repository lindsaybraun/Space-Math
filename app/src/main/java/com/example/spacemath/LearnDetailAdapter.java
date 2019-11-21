package com.example.spacemath;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LearnDetailAdapter extends RecyclerView.Adapter<LearnDetailAdapter.ViewHolder>   {
    public ArrayList<Topic> topics;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageResource;

        public TextView topicTitle;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageResource = itemView.findViewById(R.id.topicImage);
                topicTitle = itemView.findViewById(R.id.tv_topic);

        }
    }

    public LearnDetailAdapter(ArrayList<Topic> topics) {
        this.topics = topics;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.topic_item, parent, false);
        ViewHolder viewHolder =  new ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        final Topic currentTopic = topics.get(position);

        //set topic title and image
        holder.topicTitle.setText(currentTopic.getTopicName());
        holder.imageResource.setImageResource(currentTopic.getTopicImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();
                Intent intent = new Intent(context, TopicDetailActivity.class);
                intent.putExtra("Topic", currentTopic);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {

        return topics.size();
    }


}