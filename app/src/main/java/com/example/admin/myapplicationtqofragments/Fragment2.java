package com.example.admin.myapplicationtqofragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment2 extends Fragment {
    Button button;

    public static Fragment2 newFragment() {
        Fragment2 fragment2 = new Fragment2();
        return fragment2;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        return inflater.inflate(R.layout.fragment2, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        button = (Button) view.findViewById(R.id.button);

    }

    public void onClick(View view) {
        Fragment3 fragment3 = Fragment3.newFragment();


        FragmentManager childFragmentManager = getChildFragmentManager();
        childFragmentManager.beginTransaction().add(R.id.fragment3, fragment3);


    }


}
