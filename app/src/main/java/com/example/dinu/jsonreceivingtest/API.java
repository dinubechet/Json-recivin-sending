package com.example.dinu.jsonreceivingtest;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface API {

    @POST("/dev/login")
    Call<ServerResponse> getResponse(@Body Model model);
}
