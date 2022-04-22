package com.example.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new fragment1(),"one");
        vpAdapter.addFragment(new fragment2(), "two");
        vpAdapter.addFragment(new fragment3(), "three");
        vpAdapter.addFragment(new fragment4(), "four");
        vpAdapter.addFragment(new fragment5(), "five");
        vpAdapter.addFragment(new fragment6(), "six");
        vpAdapter.addFragment(new fragment7(), "seven");
        vpAdapter.addFragment(new fragment8(), "eight");

        viewPager.setAdapter(vpAdapter);
 
    }
}