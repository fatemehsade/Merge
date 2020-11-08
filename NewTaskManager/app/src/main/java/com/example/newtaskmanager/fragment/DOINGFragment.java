package com.example.newtaskmanager.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.newtaskmanager.R;


public class DOINGFragment extends Fragment {


    public DOINGFragment() {
        // Required empty public constructor
    }

    public static DOINGFragment newInstance(String param1, String param2) {
        DOINGFragment fragment = new DOINGFragment();
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
        View view= inflater.inflate(R.layout.fragment_d_o_i_n_g, container, false);
        ImageView imageView=view.findViewById(R.id.img_doing);
        imageView.setImageResource(R.drawable.ic_blank);
        return view;
    }
}