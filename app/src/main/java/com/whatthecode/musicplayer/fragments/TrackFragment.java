package com.whatthecode.musicplayer.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.whatthecode.musicplayer.R;

/**
 * handels the fragment fragment_tracks
 */

public class TrackFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_tracks,viewGroup,false);
    }
}
