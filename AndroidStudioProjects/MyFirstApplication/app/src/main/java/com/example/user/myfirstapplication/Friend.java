package com.example.user.myfirstapplication;

/**
 * Created by user on 12/3/2016.
 */

public class Friend {

    private static final int DEFAULT_POINTS = 100;

    private int myPoints = DEFAULT_POINTS;

    private String myName;


    public Friend(final String theName) {
        myName = theName;
    }


    public int getPoints() {
        return myPoints;
    }

    public String getName() {
        return myName;
    }
}
