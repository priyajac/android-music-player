package com.whatthecode.musicplayer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Nipun Haldar on 6/8/2017.
 */

public class homePageAdapter extends FragmentPagerAdapter {

    public homePageAdapter(FragmentManager fm) {super(fm);}

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new trackFragment();
        else if (position == 1)
            return new albumFragment();
        else if (position == 2)
            return new artistFragment();
        else
            return new playlistFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }
}
