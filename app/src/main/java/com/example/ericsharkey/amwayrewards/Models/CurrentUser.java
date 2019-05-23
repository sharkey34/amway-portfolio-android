package com.example.ericsharkey.amwayrewards.Models;

public class CurrentUser {

    private String email;
    private String name;
    private int points;


    public CurrentUser(){

    }

    public CurrentUser(String email, String name, int points) {
        this.email = email;
        this.name = name;
        this.points = points;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}
