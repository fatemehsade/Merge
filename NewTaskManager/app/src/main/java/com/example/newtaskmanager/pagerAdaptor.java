package com.example.newtaskmanager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.newtaskmanager.fragment.DOINGFragment;
import com.example.newtaskmanager.fragment.DONEFragment;
import com.example.newtaskmanager.fragment.TODOFragment;

public class pagerAdaptor extends FragmentStateAdapter {
    int mNumOfTabs;
    public pagerAdaptor(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }



    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                TODOFragment todoFragment = new TODOFragment();
                return todoFragment;
            case 1:
                DOINGFragment doingFragment=new DOINGFragment();
                return doingFragment;
            case 2:
                DONEFragment doneFragment=new DONEFragment();
                return doneFragment;
            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return mNumOfTabs;
    }


}
