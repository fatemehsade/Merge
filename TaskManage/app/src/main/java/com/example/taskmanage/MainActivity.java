package com.example.taskmanage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

import static com.example.taskmanage.R.id.tablayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager=findViewById(R.id.pager);
        MyPagerAdaptor myPagerAdaptor=new MyPagerAdaptor(getSupportFragmentManager(),3);
        viewPager.setAdapter(myPagerAdaptor);
        TabLayout tabLayout=findViewById(tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}