package com.example.mycriminalintent.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
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
        setListener();
        return view;
    }


    private void setListener() {
        mButtonDate.setEnabled(false);
        mEditTextTitle.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
       mButtonDate.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

           }
       });
        mSolved.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
    }

    private void findViews(View view) {
        mEditTextTitle=view.findViewById(R.id.editText_crime_title);
        mButtonDate=view.findViewById(R.id.crime_date);
        mSolved=view.findViewById(R.id.crime_solved);
    }
}