package com.example.mycriminalintent.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mycriminalintent.R;
import com.example.mycriminalintent.activity.CrimeDetailActivity;
import com.example.mycriminalintent.javaClass.Crime;
import com.example.mycriminalintent.repository.CrimeRepository;

import java.util.List;


public class CrimeListFragment extends Fragment {
    private CrimeRepository mRepository;
    private RecyclerView mRecyclerView;
    public static final String EXTRA_CRIME_ID="com.example.mycriminalintent.fragmentCrimeId";


    public CrimeListFragment() {
        // Required empty public constructor
        mRepository=CrimeRepository.getInstance();
    }

    public static CrimeListFragment newInstance() {

        Bundle args = new Bundle();

        CrimeListFragment fragment = new CrimeListFragment();
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
        View view = inflater.inflate(R.layout.fragment_crime_list, container, false);
        findViews(view);
        initViews();
        return view;
    }

    private void initViews() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<Crime> crimes=mRepository.getCrimes();
        CrimeAdaptor crimeAdaptor=new CrimeAdaptor(crimes);
        mRecyclerView.setAdapter(crimeAdaptor);
    }

    private void findViews(View view) {
        mRecyclerView=view.findViewById(R.id.recyclerview_crime_list);
    }

    private class CrimeHolder extends RecyclerView.ViewHolder {
        private TextView mTextViewTitle;
        private TextView mTextViewDate;
        private Crime mCrime;

        public CrimeHolder(@NonNull View itemView) {
            super(itemView);
            mTextViewTitle=itemView.findViewById(R.id.row_crime_title);
            mTextViewDate=itemView.findViewById(R.id.row_crime_date);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=CrimeDetailActivity.newIntent(getActivity(),mCrime.getId());
                    startActivity(intent);

                }
            });
        }
        public void bindCrime(Crime crime){
            mCrime=crime;
            mTextViewTitle.setText(crime.getTitle());
            mTextViewDate.setText(crime.getDate().toString());
        }
    }
    public class CrimeAdaptor extends RecyclerView.Adapter<CrimeHolder>{
        private List<Crime> mCrimes;

        public List<Crime> getCrimes() {
            return mCrimes;
        }

        public void setCrimes(List<Crime> crimes) {
            mCrimes = crimes;
        }

        public CrimeAdaptor(List<Crime> crimes) {
            mCrimes = crimes;
        }

        @NonNull
        @Override
        public CrimeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view=LayoutInflater.from(getActivity()).
                    inflate(R.layout.crime_row_list,parent,false);
            CrimeHolder crimeHolder=new CrimeHolder(view);
            return crimeHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull CrimeHolder holder, int position) {
            Crime crime=mCrimes.get(position);
            holder.bindCrime(crime);


        }

        @Override
        public int getItemCount() {
            return mCrimes.size();
        }
    }
}