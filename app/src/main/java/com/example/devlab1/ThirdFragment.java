package com.example.devlab1;

import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Objects;

public class ThirdFragment extends Fragment {

    private Toolbar mToolbar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_third, container, false);
        mToolbar = v.findViewById(R.id.thirdToolbar);
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            int systemActivityColor = R.color.black;
            getActivity().getWindow().setStatusBarColor(getActivity().getResources().getColor(systemActivityColor));
            getActivity().getWindow().setNavigationBarColor(getActivity().getResources().getColor(systemActivityColor));
        }
    }
}