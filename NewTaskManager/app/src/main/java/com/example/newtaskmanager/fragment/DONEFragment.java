package com.example.newtaskmanager.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.newtaskmanager.R;


public class DONEFragment extends Fragment {



    public DONEFragment() {
        // Required empty public constructor
    }


    public static DONEFragment newInstance(String param1, String param2) {
        DONEFragment fragment = new DONEFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_d_o_n_e, container, false);
        ImageView imageView=view.findViewById(R.id.img_done);
        imageView.setImageResource(R.drawable.ic_blank);


        return view;
    }
}