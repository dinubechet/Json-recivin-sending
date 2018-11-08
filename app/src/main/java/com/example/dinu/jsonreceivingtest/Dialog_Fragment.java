package com.example.dinu.jsonreceivingtest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

@SuppressLint("ValidFragment")
public class Dialog_Fragment extends DialogFragment {

TextView infoDisplay;
String response;

    @SuppressLint("ValidFragment")
    public Dialog_Fragment(String response) {
        this.response = response;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_fragment, container, false);
        infoDisplay = view.findViewById(R.id.infoDisplay);
        infoDisplay.setText(response);

    return view;
    }
}
