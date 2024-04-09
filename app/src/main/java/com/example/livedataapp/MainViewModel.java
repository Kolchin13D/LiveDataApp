package com.example.livedataapp;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private int counter = 0;
    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    public int getCounter(){
        counter++;
        return counter;
    }

    public  MutableLiveData<Integer> getInitialCounter(){
        countLiveData.setValue(counter);
        return countLiveData;
    }

}
