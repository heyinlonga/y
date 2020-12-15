package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.fragment1.HomeFragment1;
import com.example.myapplication.fragment1.HomeFragment2;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager vp;
    private ArrayList<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tab = (TabLayout) findViewById(R.id.tab);
        vp = (ViewPager) findViewById(R.id.vp);

        fragments = new ArrayList<>();
        fragments.add(new HomeFragment1());
        fragments.add(new HomeFragment2());
        Vpadapter vpadapter = new Vpadapter(getSupportFragmentManager(),fragments);
        vp.setAdapter(vpadapter);
        tab.setupWithViewPager(vp);
        tab.getTabAt(0).setText("FRAGMENT1");
        tab.getTabAt(1).setText("FRAGMENT2");
    }
}
