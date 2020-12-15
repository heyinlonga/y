package com.example.myapplication.fragment1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.myapplication.R;
import com.example.myapplication.Vpadapter;
import com.example.myapplication.fragmetn.HomeFragment;
import com.example.myapplication.fragmetn.KnowFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class HomeFragment1 extends Fragment {
    private TabLayout tab1;
    private ViewPager vp1;
    private ArrayList<Fragment> fragments;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = View.inflate(getActivity(), R.layout.home_layout, null);
        tab1 = inflate.findViewById(R.id.tab1);
        vp1 = inflate.findViewById(R.id.vp1);
        initView();
        return inflate;
    }

    private void initView() {
        fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new KnowFragment());
        Vpadapter vpadapter = new Vpadapter(getChildFragmentManager(), fragments);
        vp1.setAdapter(vpadapter);
        tab1.setupWithViewPager(vp1);
        tab1.getTabAt(0).setText("FRAGMENT1");
        tab1.getTabAt(1).setText("FRAGMENT2");
    }
}
