package com.example.lkpnavigationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        Button btnDetails = view.findViewById(R.id.btn_details);
        Button btnPrice = view.findViewById(R.id.btn_price);
        Button btnSize = view.findViewById(R.id.btn_size);
        btnDetails.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_DetailsActivity));
        btnPrice.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_PriceActivity));
        btnSize.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_sizeActivity));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}