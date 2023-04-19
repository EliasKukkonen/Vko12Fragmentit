package com.example.fragmentitvko12;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.fragmentitvko12.fragments.FragmentAdd;
import com.example.fragmentitvko12.fragments.FragmentInfo;
import com.example.fragmentitvko12.fragments.FragmentList;
import com.example.fragmentitvko12.fragments.FragmentMain;

public class TabPagerAdapter extends FragmentStateAdapter {

    public TabPagerAdapter(@NonNull TabActivity fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new FragmentAdd();
            case 1:
                return new FragmentList();
            case 2:
                return new FragmentMain();
            case 3:
                return new FragmentInfo();

            default:
                return new FragmentMain();
        }

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}

