package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class KlikLoginFragment extends Fragment {
    TextView nama, npmm;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_klik_login, container, false);
        nama = view.findViewById(R.id.name);
        npmm = view.findViewById(R.id.npm);
        return view;
    }


    public void setKlikLogin(MainActivity mainActivity) {
    }
}