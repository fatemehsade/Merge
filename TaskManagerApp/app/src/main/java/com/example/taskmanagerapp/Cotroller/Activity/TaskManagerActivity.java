package com.example.taskmanagerapp.Cotroller.Activity;

import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;

import com.example.taskmanagerapp.Cotroller.Fragment.TaskManagerFragment;

public class TaskManagerActivity extends SingleFragmentActivity {
    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, TaskManagerActivity.class);
        return intent;
    }


    @Override
    public Fragment createFragment() {
        return new TaskManagerFragment();
    }
}