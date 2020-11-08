package com.example.taskmanagerapp.Model;

import java.util.UUID;

public class User {
    private String userName;
    private String password;
    private UUID userId;

    public User() {
        userId=UUID.randomUUID();
    }

    public User(String userName, String password, UUID userId) {
        this.userName = userName;
        this.password = password;
        this.userId = userId;
    }

    public User(String userName, String password) {
        this();
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getUserId() {
        return userId;
    }
}
