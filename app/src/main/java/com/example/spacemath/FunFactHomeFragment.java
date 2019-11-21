package com.example.spacemath;


import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;

import java.util.Random;


// fragment to give fun math fact from numbersapi and display random space image from nasa api
public class FunFactHomeFragment extends Fragment {

    private EditText number;
    private Button getFunFact;
    private TextView funFactSlot;
    public ImageView spaceImage;
    public TextView imageTitle;

    public FunFactHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fun_fact_home, container, false);

        number = view.findViewById(R.id.enterNumber);
        getFunFact = view.findViewById((R.id.getFunFact));
        funFactSlot = view.findViewById(R.id.funFactSpot);
        spaceImage = view.findViewById(R.id.spaceImage);
        imageTitle = view.findViewById(R.id.imageTitle);

        //image api request
        String image_url = "https://images-api.nasa.gov/search?media_type=image";
        final RequestQueue request_queue = Volley.newRequestQueue(getActivity());

        Response.Listener<String> response_listener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson = new Gson();
                SpaceImage current_image = gson.fromJson(response, SpaceImage.class);
                setData(current_image);
            }
        };

        Response.ErrorListener error_listener = new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        };


        StringRequest string_request = new StringRequest(Request.Method.GET, image_url, response_listener, error_listener);
        request_queue.add(string_request);

        //numbers api request on button click
        getFunFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String numberValue = number.getText().toString();

                String url = "http://numbersapi.com/" + numberValue;
                final RequestQueue requestQueue = Volley.newRequestQueue(getActivity());

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        funFactSlot.setText(response);
                    }
                };

                Response.ErrorListener errorListener = new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.printStackTrace();
                    }
                };

                StringRequest stringRequest = new StringRequest(Request.Method.GET, url, responseListener, errorListener);
                requestQueue.add(stringRequest);

            }
        });

        return view;
    }

    // returns random integer from a range
    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    // sets random image and image title
    public void setData(SpaceImage current_image) {
        Integer num_images = current_image.collection.items.length;
        Integer random_num = getRandomNumberInRange(0,num_images - 1);

        String image_url = current_image.collection.items[random_num].links[0].getHref();
        String image_title = current_image.collection.items[random_num].data[0].getTitle();

        imageTitle.setText(image_title);
        Glide.with(this).load(image_url).into(spaceImage);
    }


}
