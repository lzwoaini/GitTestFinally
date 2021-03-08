package com.example.gittestfinally;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.android.material.badge.BadgeDrawable;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> number ;

    public MyViewModel() {
        if (number==null) {
            number = new MutableLiveData<>();
            number.setValue(0);
        }
    }

    public LiveData<Integer> getNumber() {
        return number;
    }

    public void add(int n) {
        number.setValue(number.getValue() + n);
    }

    public void reset() {
        number.setValue(0);
    }
}
