package com.androidrion.navigationdrawer.ui.call;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CallsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CallsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is calls fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}