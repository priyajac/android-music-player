package com.whatthecode.musicplayer;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * creates the adapters for the mainactivity
 */

public class homePageAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public homePageAdapter(Context context ,FragmentManager fm) {
        super(fm);
        mContext = context;
    }

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

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0)
            return mContext.getString(R.string.tracks);
        else if(position == 1)
            return mContext.getString(R.string.album);
        else if(position == 2)
            return mContext.getString(R.string.artist);
        else
            return mContext.getString(R.string.playlist);
    }
}
