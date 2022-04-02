package com.example.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import com.bumptech.glide.Glide;
import com.example.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        getSupportActionBar().setTitle("Image Search");

        binding.buttonLoad.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                Glide.with(view).load("https://source.unsplash.com/480x270/?" +binding.editTextKeyword.getText()).into(binding.imageView);
                binding.editTextKeyword.setText("");
                }
});

    }
}