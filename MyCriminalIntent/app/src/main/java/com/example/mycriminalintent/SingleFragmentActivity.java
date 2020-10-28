package com.example.mycriminalintent;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.mycriminalintent.fragment.CrimeListFragment;

public abstract class SingleFragmentActivity extends AppCompatActivity {
    public abstract Fragment CreateFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        FragmentManager fragmentManager=getSupportFragmentManager();
        Fragment fragment=fragmentManager.findFragmentById(R.id.fragment_container);
        if (fragment==null){
            fragmentManager.beginTransaction().add
                    (R.id.fragment_container,CreateFragment()).commit();
        }
    }
}
