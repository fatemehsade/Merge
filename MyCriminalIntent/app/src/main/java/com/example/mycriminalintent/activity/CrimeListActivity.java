package com.example.mycriminalintent.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.mycriminalintent.R;
import com.example.mycriminalintent.SingleFragmentActivity;
import com.example.mycriminalintent.fragment.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {


    @Override
    public Fragment CreateFragment() {
        return new CrimeListFragment();
    }
}