package com.whatthecode.musicplayer.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whatthecode.musicplayer.R;

/**
 * handels the fragment fragment_playlists
 */

public class PlaylistFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_playlists,viewGroup,false);
    }

}
