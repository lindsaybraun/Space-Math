package com.example.spacemath;


import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.material.textfield.TextInputLayout;
import com.google.gson.Gson;


/**
 * A simple {@link Fragment} subclass.
 */
public class FunFactHomeFragment extends Fragment {


    private EditText number;
    private Button getFunFact;
    private TextView funFactSlot;

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


}
