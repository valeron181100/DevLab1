package com.example.devlab1;

import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FirstFragment extends Fragment {

    TextView mLinkTV;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_first, container, false);

        mLinkTV = v.findViewById(R.id.linkTV);
        mLinkTV.setText(
                Html.fromHtml(
                        "При входе вы соглашаетесь с <a href=\"http://www.google.com\">условиями</a> "));
        mLinkTV.setMovementMethod(LinkMovementMethod.getInstance());
        return v;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            int systemActivityColor = R.color.first_systemColor;
            getActivity().getWindow().setStatusBarColor(getActivity().getResources().getColor(systemActivityColor));
            getActivity().getWindow().setNavigationBarColor(getActivity().getResources().getColor(systemActivityColor));
        }
    }
}