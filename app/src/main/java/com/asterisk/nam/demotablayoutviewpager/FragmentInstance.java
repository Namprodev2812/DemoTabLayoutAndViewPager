package com.asterisk.nam.demotablayoutviewpager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Calendar;

public class FragmentInstance extends Fragment {

    private static final String KEY_COLOR = "key_color";
    private static final int CASE_0 = 0;
    private static final int CASE_1 = 1;
    private static final int CASE_2 = 2;
    private static final int CASE_3 = 3;
    private static final int CASE_4 = 4;
    private static final int CASE_5 = 5;
    LinearLayout mLinearLayout;
    TextView mTextStt;

    public FragmentInstance() {

    }
    public static FragmentInstance newInstance(int color) {
        FragmentInstance fragment = new FragmentInstance();
        Bundle args = new Bundle();
        args.putInt(KEY_COLOR, color);
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mRootView = inflater.inflate(R.layout.fragment_instance, container, false);
        mLinearLayout = (LinearLayout) mRootView.findViewById(R.id.ll_fragment_instance);
        mTextStt = (TextView) mRootView.findViewById(R.id.stt_fragment_instance);

        switch (getArguments().getInt(KEY_COLOR)) {
            case CASE_0:
                showData(Color.GREEN,CASE_0);
                break;
            case CASE_1:
                showData(Color.RED,CASE_1);
                break;
            case CASE_2:
                showData(Color.BLUE,CASE_2);
                break;
            case CASE_3:
                showData(Color.WHITE,CASE_3);
                break;
            case CASE_4:
                showData(Color.YELLOW,CASE_4);
                break;
            default:
                showData(Color.GRAY,CASE_5);
                break;
        }
        return mRootView;
    }

    public void showData(int mColor,int mStt){
        mLinearLayout.setBackgroundColor(mColor);
        mTextStt.setText(mStt+"");
    }
}
