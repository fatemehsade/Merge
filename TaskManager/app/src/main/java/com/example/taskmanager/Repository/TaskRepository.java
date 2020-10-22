package com.example.taskmanager.Repository;

import com.example.taskmanager.activity.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private static TaskRepository sInstance;
    private List<Task> mTasks;

    public List<Task> getTasks() {
        return mTasks;
    }

    public void setTasks(List<Task> tasks) {
        mTasks = tasks;
    }

    public static TaskRepository getInstance() {
        return sInstance;
    }

    public static void setInstance(TaskRepository instance) {
        sInstance = instance;
    }

    private TaskRepository(){
        mTasks=new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            Task crime=new Task();
            crime.setTitle("crime"+(i+1));
            crime.getState();

        }

    }
}
