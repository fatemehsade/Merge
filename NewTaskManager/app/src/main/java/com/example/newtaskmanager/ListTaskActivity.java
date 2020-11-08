package com.example.newtaskmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ListTaskActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 viewPager2=findViewById(R.id.view_pager);
        viewPager2.setAdapter(new pagerAdaptor(this));
        TabLayout tabLayout=findViewById(R.id.tablayout);
        TabLayoutMediator tabLayoutMediator=new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> {
                    switch (position){
                        case 0:
                            tab.setText("TODO");
                            break;
                        case 1:
                            tab.setText("DOING");
                            break;
                         case 2:
                            tab.setText("DONE");
                            break;
                    }

                });
        tabLayoutMediator.attach();


    }

}