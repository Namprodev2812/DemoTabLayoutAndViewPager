package com.asterisk.nam.demotablayoutviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class FragmentStateAdapter extends FragmentStatePagerAdapter {

    private String mListTitle[] = {"Fragment1","Fragment2","Fragment3","Fragment4","Fragment5","Fragment6"};
    public FragmentStateAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int i) {
        return FragmentInstance.newInstance(i);
    }
    @Override
    public int getCount() {
        return mListTitle.length;
    }
}
