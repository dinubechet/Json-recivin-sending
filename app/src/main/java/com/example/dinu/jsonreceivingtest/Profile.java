package com.example.dinu.jsonreceivingtest;

import com.google.gson.annotations.SerializedName;

public class Profile {

    @SerializedName("email")
    String email;

    @SerializedName("id")
    String id;

    @SerializedName("phone")
    String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
