package com.example.dinu.jsonreceivingtest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressLint("ValidFragment")
public class LowerFragment extends Fragment {

    TextView infoDisplay;
    String resp;

    public LowerFragment(String resp) {
        this.resp = resp;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lower_fragment, container, false);
        infoDisplay = view.findViewById(R.id.infoDisplay);
        infoDisplay.setText(resp);
        return view;
    }
}
