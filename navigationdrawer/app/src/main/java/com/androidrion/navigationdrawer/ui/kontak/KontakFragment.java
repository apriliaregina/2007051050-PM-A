package com.androidrion.navigationdrawer.ui.kontak;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.androidrion.navigationdrawer.databinding.FragmentKontakBinding;

public class KontakFragment extends Fragment {

    private FragmentKontakBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        KontakViewModel kontakViewModel =
                new ViewModelProvider(this).get(KontakViewModel.class);

        binding = FragmentKontakBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.kontak;
        kontakViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}