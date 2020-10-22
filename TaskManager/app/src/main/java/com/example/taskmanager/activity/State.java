package com.example.taskmanager.activity;

import java.util.Random;

public enum State {
    Done,Doing,Todo;

    public static State getRandom() {
        Random random = new Random();
        return values()[random.nextInt(3)];
    }

}
