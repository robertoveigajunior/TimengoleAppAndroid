package com.example.robertoveigajunior.timengole.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.robertoveigajunior.timengole.fragments.TimesFragment;

/**
 * Created by robertoveigajunior on 19/11/16.
 */

public class TabAdapter extends FragmentStatePagerAdapter{

    public TabAdapter(FragmentManager fm) {
        super(fm);
    }

    public static final int TOTAL_LABS =  2;

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        if(position == 0) {
            bundle.putString("tipo","Times");
        }

        Fragment f = new TimesFragment();
        f.setArguments(bundle);
        return f;
    }

    @Override
    public int getCount() {
        return TOTAL_LABS;
    }
}
