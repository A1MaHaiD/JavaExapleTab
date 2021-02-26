package com.example.javaexampletab;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //add Fragment
        adapter.AddFragment(new FragmentCall(), "Call");
        adapter.AddFragment(new FragmentContact(), "Contact");
        adapter.AddFragment(new FragmentFav(), "Fav");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_baseline_call_24_white);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_group_24_white);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_baseline_star_24_white);

        //Shadow from the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);


    }
}