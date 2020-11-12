package com.example.taskmanagerapp.Adaptor;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.taskmanagerapp.Cotroller.Fragment.StateFragment;

public class stateAdaptor extends FragmentStateAdapter {
    public stateAdaptor(@NonNull FragmentActivity fragmentActivity)
    {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new StateFragment();
            case 1:
                return new StateFragment();
            case 2:
                return new StateFragment();
            default:
                return null;
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
