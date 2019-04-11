package com.asterisk.nam.demotablayoutviewpager;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private Toolbar mToolbar;
    private static final int OFF_SCREEN_PAGER_LIMIT = 1;
    private static final int TAB_INDEX_0 = 0;
    private static final int TAB_INDEX_1 = 1;
    private static final int TAB_INDEX_2 = 2;
    private static final int TAB_INDEX_3 = 3;
    private static final int TAB_INDEX_4 = 4;
    private static final int TAB_INDEX_5 = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        createToolBar();
        //createViewPager();
        createViewPagerInstance();
        createTabLayout();
    }
    public void init() {
        mTabLayout = findViewById(R.id.tab_main);
        mViewPager = findViewById(R.id.vp_main);
        mToolbar   = findViewById(R.id.tb_main);
    }
    public void createToolBar() {
        setSupportActionBar(mToolbar);
    }
    public void createTabLayout() {
        mTabLayout.setupWithViewPager(mViewPager);
        setIconTabStandard();
        setIconTabLoading();
    }
    public void createViewPager() {
        FragmentAdapter adapterFragmentViewPager = new FragmentAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapterFragmentViewPager);
        mViewPager.setOffscreenPageLimit(1);
    }
    public void createViewPagerInstance() {
        FragmentStateAdapter adapterFragmentViewPager = new FragmentStateAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(adapterFragmentViewPager);
        mViewPager.setOffscreenPageLimit(OFF_SCREEN_PAGER_LIMIT);
    }
    @SuppressLint("ResourceAsColor")
    public void setIconTabStandard() {
        mTabLayout.getTabAt(TAB_INDEX_0).setIcon(R.drawable.ic_fiber_new_yellow_24dp).select();
        mTabLayout.getTabAt(TAB_INDEX_1).setIcon(R.drawable.ic_people_black_24dp);
        mTabLayout.getTabAt(TAB_INDEX_2).setIcon(R.drawable.ic_nature_people_black_24dp);
        mTabLayout.getTabAt(TAB_INDEX_3).setIcon(R.drawable.ic_ondemand_video_black_24dp);
        mTabLayout.getTabAt(TAB_INDEX_4).setIcon(R.drawable.ic_notifications_black_24dp);
        mTabLayout.getTabAt(TAB_INDEX_5).setIcon(R.drawable.ic_view_headline_black_24dp);
    }

    public void setIconTabLoading() {
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int tabIconColor = ContextCompat.getColor(getApplicationContext(), R.color.tab_yellow);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int tabIconColor = ContextCompat.getColor(getApplicationContext(), R.color.tab_black);
                tab.getIcon().setColorFilter(tabIconColor, PorterDuff.Mode.SRC_IN);
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }
}


