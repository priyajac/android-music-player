package com.whatthecode.musicplayer;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.home_page_activity);

        ViewPager homeViewPager = (ViewPager) findViewById(R.id.home_pager);

        homePageAdapter adapter = new homePageAdapter(getSupportFragmentManager());

        homeViewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.home_tabs);

        tabLayout.setupWithViewPager(homeViewPager);
    }
}
