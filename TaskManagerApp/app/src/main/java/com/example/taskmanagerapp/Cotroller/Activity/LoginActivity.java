package com.example.taskmanagerapp.Cotroller.Activity;

import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;

import com.example.taskmanagerapp.Cotroller.Fragment.LoginFragment;

public class LoginActivity extends SingleFragmentActivity {


    public static void start(Context context) {
        Intent starter = new Intent(context, LoginActivity.class);
        context.startActivity(starter);
    }
    @Override
    public Fragment createFragment() {
        return new LoginFragment();
    }
}