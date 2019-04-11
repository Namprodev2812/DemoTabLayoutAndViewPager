package com.asterisk.nam.demotablayoutviewpager;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private String mListTitle[] = {"Fragment1","Fragment2","Fragment3","Fragment4","Fragment5","Fragment6"};
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int i) {
        return FragmentInstance.newInstance(i);
    }
    @Override
    public int getItemPosition(@NonNull Object object) {
        return super.getItemPosition(object);
    }
    @Override
    public int getCount() {
        return mListTitle.length;
    }
}
