package com.example.devlab1.models;

import android.app.Activity;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.devlab1.FirstFragment;
import com.example.devlab1.R;
import com.example.devlab1.SecondFragment;
import com.example.devlab1.ThirdFragment;

public class ContentViewPagerAdapter extends FragmentPagerAdapter {

    private Activity mActivity;

    public ContentViewPagerAdapter(Activity activity, @NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.mActivity = activity;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Log.d("PAGER", position + "");
        switch (position) {
            case 0: return new FirstFragment();
            case 1: return new SecondFragment();
            default: return new ThirdFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
