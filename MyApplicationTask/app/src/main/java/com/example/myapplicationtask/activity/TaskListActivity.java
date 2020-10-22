package com.example.myapplicationtask.activity;

import androidx.fragment.app.Fragment;

import com.example.myapplicationtask.SingleFragmentActivity;
import com.example.myapplicationtask.fragment.TaskListFragment;

public class TaskListActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment() {
        return new TaskListFragment();
    }
}
