package com.example.admin.myapplicationtqofragments;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final Intent newIntent(Context context) {
        return new Intent(context, MyService.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        startService(MyService.n )
        setContentView(R.layout.activity_main);


        Fragment1 fragment1 = Fragment1.newFragment();
        Fragment2 fragment2 = Fragment2.newFragment();


        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fragment, fragment1).add(R.id.fragment2, fragment2).commitNow();


    }
}
