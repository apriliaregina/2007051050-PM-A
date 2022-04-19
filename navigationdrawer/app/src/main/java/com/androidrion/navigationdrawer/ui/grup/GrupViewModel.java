package com.androidrion.navigationdrawer.ui.grup;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GrupViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GrupViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Grup fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}