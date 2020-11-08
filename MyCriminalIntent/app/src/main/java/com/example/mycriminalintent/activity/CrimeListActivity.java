package com.example.mycriminalintent.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.mycriminalintent.R;
import com.example.mycriminalintent.SingleFragmentActivity;
import com.example.mycriminalintent.fragment.CrimeListFragment;

public class CrimeListActivity extends SingleFragmentActivity {
    public static Intent newIntent(Context context){
        Intent intent=new Intent(context,CrimeListActivity.class);
        return intent;
    }


    @Override
    public Fragment CreateFragment() {
        return CrimeListFragment.newInstance();
    }
}