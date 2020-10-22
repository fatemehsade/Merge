package com.example.taskmanager.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import com.example.taskmanager.R;
import com.example.taskmanager.Repository.TaskRepository;
import com.example.taskmanager.activity.Task;

import java.util.List;

public class ListWorkFragment extends Fragment {
    private RecyclerView mRecyclerView;



    public ListWorkFragment() {
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
        View view= inflater.inflate(R.layout.fragment_list_work, container, false);
        findViews(view);
        init();
        return view;
    }

    private void findViews(View view) {
        mRecyclerView=view.findViewById(R.id.recycler_view);
    }
    private class TaskHolder extends RecyclerView.ViewHolder {
        private TextView mTextView_Name;
        private TextView mTextView_state;
        private Task mTask;

        public TaskHolder(@NonNull View itemView) {
            super(itemView);
            mTextView_Name=itemView.findViewById(R.id.row_txt_name);
            mTextView_state=itemView.findViewById(R.id.row_txt_state);
        }
        private void bindTask(Task task){
            mTask=task;
            mTextView_Name.setText(task.getTitle());
            mTextView_state.setText(task.getState().toString());
        }
    }
    private class Adapter extends RecyclerView.Adapter<TaskHolder>{
        private List<Task> mTasks;

        public List<Task> getTasks() {
            return mTasks;
        }

        public void setTasks(List<Task> tasks) {
            mTasks = tasks;
        }

        public Adapter(List<Task> tasks) {
            mTasks = tasks;
        }

        @NonNull
        @Override
        public TaskHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(getActivity());
            View view=layoutInflater.inflate(R.layout.task_row_list,parent,false);
            TaskHolder taskHolder=new TaskHolder(view);
            return taskHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull TaskHolder holder, int position) {
            Task task=mTasks.get(position);
            holder.bindTask(task);

        }

        @Override
        public int getItemCount() {
            return mTasks.size();
        }
    }
    private void init(){
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        TaskRepository crimeRepository=TaskRepository.getInstance();
        List<Task> crimes=crimeRepository.getTasks();
        Adapter crimeAdapter=new Adapter(crimes);
        mRecyclerView.setAdapter(crimeAdapter);

    }
}