package com.whatthecode.musicplayer.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.whatthecode.musicplayer.R;
import com.whatthecode.musicplayer.fragments.AlbumFragment;
import com.whatthecode.musicplayer.fragments.ArtistFragment;
import com.whatthecode.musicplayer.fragments.PlaylistFragment;
import com.whatthecode.musicplayer.fragments.TrackFragment;

/**
 * creates the adapters for the mainactivity
 */

public class HomePageAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public HomePageAdapter(Context context , FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new TrackFragment();
        else if (position == 1)
            return new AlbumFragment();
        else if (position == 2)
            return new ArtistFragment();
        else
            return new PlaylistFragment();
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
            return mContext.getString(R.string.albums);
        else if(position == 2)
            return mContext.getString(R.string.artists);
        else
            return mContext.getString(R.string.playlists);
    }
}
