package com.example.taskmanager.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.taskmanager.R;
import com.example.taskmanager.activity.ListWorkActivity;
import com.example.taskmanager.activity.Task;


public class TaskManagerFragment extends Fragment {
    private EditText mEditText_name;
    private EditText mEditText_number;
    private Button mButton_make;
    private Task mTask;


    public TaskManagerFragment() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_task_manager, container, false);
        findViews(view);
        setListener();

        return view;
    }

    private void initViews(View view) {
        mButton_make=view.findViewById(R.id.btn_make);
        mEditText_name.setText(mTask.getTitle());
        mEditText_number.setText(mTask.getNumberOfWork());
    }
    private void setListener(){
        mButton_make.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), ListWorkActivity.class);
                startActivity(intent);
            }
        });
    }
    private void findViews(View view){
        mButton_make=view.findViewById(R.id.btn_make);
        mEditText_name=view.findViewById(R.id.editTxt_name);
        mEditText_number=view.findViewById(R.id.editTxt_number);

    }
}