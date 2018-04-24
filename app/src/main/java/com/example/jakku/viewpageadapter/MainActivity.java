package com.example.jakku.viewpageadapter;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager= findViewById(R.id.view_pager);
         AcitivityPageAdapter pager = new AcitivityPageAdapter(this);
         viewPager.setAdapter(pager);
    }
}
