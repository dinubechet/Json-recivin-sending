package com.example.dinu.jsonreceivingtest;

import android.app.ProgressDialog;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    /*    EditText email;
        EditText password;
        Button sendRequest;*/
/*    Model model;

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://9g9px04l71.execute-api.us-east-1.amazonaws.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        drawContainer1(new UpperFragment());
        setContentView(R.layout.activity_main);

/*        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        sendRequest = findViewById(R.id.sendRequest);

        email.setText("test@gmail.com");
        password.setText("test");*/

/*sendRequest.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        final ProgressDialog progress = new ProgressDialog(MainActivity.this);
        progress.setTitle("Loading");
        progress.setMessage("Wait while loading...");
        progress.setCancelable(false);
        progress.show();
        model = new Model(email.getText().toString(),password.getText().toString());

        Call<ServerResponse> call = retrofit.create(API.class).getResponse(model);
        call.enqueue(new Callback<ServerResponse>() {
            @Override
            public void onResponse(Call<ServerResponse> call, Response<ServerResponse> response) {
                progress.dismiss();
                if (response.isSuccessful()){
                    draw(new LowerFragment());
                    *//*new Dialog_Fragment ("E-mail " + response.body().getProfile().getEmail() + "\nID " +
                    response.body().getProfile().getId() + "\nPhone " + response.body().getProfile().getPhone())
                            .show(getSupportFragmentManager(),"dialog");*//*
                }else {
                    try {
                        JSONObject jObjError = new JSONObject(response.errorBody().string());
                        Toast.makeText(MainActivity.this, jObjError.getString("message"), Toast.LENGTH_LONG).show();
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ServerResponse> call, Throwable t) {

            }
        });
    }
});
        password.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                sendRequest.callOnClick();
                return false;
            }
        });
    }*/

    }
    public void drawContainer1 (Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.upperContainer, fragment);
        fragmentTransaction.commit();
    }
    public void drawContainer2 (Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.lowerContainer, fragment);
        fragmentTransaction.commit();
    }
}
