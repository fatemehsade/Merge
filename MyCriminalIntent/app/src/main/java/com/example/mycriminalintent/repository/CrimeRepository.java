package com.example.mycriminalintent.repository;

import com.example.mycriminalintent.javaClass.Crime;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeRepository {
    private static CrimeRepository sInstance;
    private static final int CRIME_SIZE=100;
    private List<Crime> mCrimes;


    private CrimeRepository() {
        mCrimes=new ArrayList<>();
        for (int i = 0; i <CRIME_SIZE ; i++) {
            Crime crimes=new Crime();
            crimes.setTitle("crime"+i+1);
            crimes.setSolved(i%2==0);
            mCrimes.add(crimes);

        }

    }

    public static CrimeRepository getInstance() {
        if (sInstance==null){
            sInstance=new CrimeRepository();
        }
        return sInstance;
    }



    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public void setCrimes(List<Crime> crimes) {
        mCrimes = crimes;
    }
    public void insertCrime(Crime crime){
        mCrimes.add(crime);
    }
    public Crime getCrime(UUID id){
        for (Crime crime:mCrimes) {
            if (crime.getId()==id)
                return crime;

        }
        return null;
    }

    public void deletCrime(){

    }
    public void updateCrime(){

    }


}
