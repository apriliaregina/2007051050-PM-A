package com.androidrion.navigationdrawer.ui.kontak;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KontakViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public KontakViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Contact fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}