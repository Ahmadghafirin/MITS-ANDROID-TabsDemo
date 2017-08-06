package com.example.ahmad.tabsdemo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;

/**
 * Created by ahmad on 03/08/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    final Context context;
    private int position;

    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        this.position = position;
        switch (position) {
            case 0:
                fragment = HomeFragment.newInstance();
                break;
            case 1:
                fragment = PesanFragment.newInstance();
                break;
            case 2:
                fragment = ProfileFragment.newInstance();
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        this.position = position;
        switch (position) {
            case 0:
                return context.getResources().getString(R.string.home_fragment);
            case 1:
                return context.getResources().getString(R.string.pesan_fragment);
            case 2:
                return context.getResources().getString(R.string.profile_fragment);
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    public void setPosition(AHBottomNavigation bottomNavigation){
        bottomNavigation.setCurrentItem(position);
    }
}
