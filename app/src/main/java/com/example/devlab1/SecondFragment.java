package com.example.devlab1;

import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SecondFragment extends Fragment {

    private BottomNavigationView mNavBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_second, container, false);
        mNavBar = v.findViewById(R.id.bottomNavigationView);
        mNavBar.getOrCreateBadge(R.id.secHomeBottomIcon);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            int systemActivityColor = R.color.sec_navBarColor;
            getActivity().getWindow().setStatusBarColor(getActivity().getResources().getColor(systemActivityColor));
            getActivity().getWindow().setNavigationBarColor(getActivity().getResources().getColor(systemActivityColor));
        }
    }
}