package com.example.taskmanager.activity;

import androidx.fragment.app.Fragment;

import com.example.taskmanager.fragment.ListWorkFragment;

public class ListWorkActivity extends SingleFragmentActivity {


    @Override
    public Fragment createFragment() {
        return new ListWorkFragment();
    }
}