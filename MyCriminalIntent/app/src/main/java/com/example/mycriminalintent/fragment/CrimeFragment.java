package com.example.mycriminalintent.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.mycriminalintent.R;
import com.example.mycriminalintent.javaClass.Crime;


public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mEditTextTitle;
    private Button mButtonDate;
    private CheckBox mSolved;


    public CrimeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime=new Crime();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view= inflater.inflate(R.layout.fragment_crime, container, false);
        findViews(view);
        return view;
    }

    private void findViews(View view) {
        mEditTextTitle=view.findViewById(R.id.crime_title);
        mButtonDate=view.findViewById(R.id.crime_date);
        mSolved=view.findViewById(R.id.crime_solved);
    }
}