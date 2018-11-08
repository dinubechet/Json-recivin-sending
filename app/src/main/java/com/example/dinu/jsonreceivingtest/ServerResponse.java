package com.example.dinu.jsonreceivingtest;

import com.google.gson.annotations.SerializedName;

public class ServerResponse {

    @SerializedName("profile")
   Profile profile;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
