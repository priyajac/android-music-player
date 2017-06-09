package com.whatthecode.musicplayer.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.whatthecode.musicplayer.R;
import com.whatthecode.musicplayer.adapters.HomePageAdapter;
import com.whatthecode.musicplayer.models.Track;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Track> trackList;
    private ListView songView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ViewPager homeViewPager = (ViewPager) findViewById(R.id.home_pager);

        HomePageAdapter adapter = new HomePageAdapter(this,getSupportFragmentManager());

        homeViewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.home_tabs);

        tabLayout.setupWithViewPager(homeViewPager);
    }
}
