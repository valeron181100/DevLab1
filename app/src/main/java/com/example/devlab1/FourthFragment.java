package com.example.devlab1;

import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FourthFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fourth, container, false);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            int systemActivityColor = R.color.fourth_navBarColor;
            getActivity().getWindow().setStatusBarColor(getActivity().getResources().getColor(systemActivityColor));
            getActivity().getWindow().setNavigationBarColor(getActivity().getResources().getColor(systemActivityColor));
        }
    }
}