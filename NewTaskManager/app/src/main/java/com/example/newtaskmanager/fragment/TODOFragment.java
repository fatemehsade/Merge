package com.example.newtaskmanager.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.newtaskmanager.R;


public class TODOFragment extends Fragment {



    public TODOFragment() {
        // Required empty public constructor
    }


    public static TODOFragment newInstance(String param1, String param2) {
        TODOFragment fragment = new TODOFragment();
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
        View view= inflater.inflate(R.layout.fragment_t_o_d_o, container, false);
        ImageView imageView=view.findViewById(R.id.img_todo);
        imageView.setImageResource(R.drawable.ic_blank);

        return view;
    }
}