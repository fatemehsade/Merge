package com.example.taskmanage;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyPagerAdaptor extends FragmentStatePagerAdapter {
    private int numOfTabs;


    public MyPagerAdaptor(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        numOfTabs=behavior;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TODOFragment todoFragment = new TODOFragment();
                return todoFragment;
            case 1:
                DOINGFragment doingFragment = new DOINGFragment();
                return doingFragment;
            case 2:
                DONEFragment doneFragment = new DONEFragment();
                return doneFragment;

            default:
            return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }


}
