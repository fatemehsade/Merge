package com.example.taskmanager.activity;

import java.util.Random;
import java.util.UUID;

public class Task {
    private String title;
    private int numberOfWork;
    private State mState;


    private UUID mUUID;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;

    }

    public State getState() {
        return mState;
    }

    public int getNumberOfWork() {
        return numberOfWork;
    }


    public UUID getUUID() {
        return mUUID;
    }

    public Task() {
        mState=State.getRandom();
    }
}
