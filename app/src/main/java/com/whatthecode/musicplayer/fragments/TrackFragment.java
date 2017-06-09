package com.whatthecode.musicplayer.fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.whatthecode.musicplayer.R;
import com.whatthecode.musicplayer.adapters.TrackAdapter;
import com.whatthecode.musicplayer.dataloader.TrackLoader;

/**
 * handels the fragment fragment_tracks
 */

public class TrackFragment extends Fragment {

    private RecyclerView recyclerView;
    private TrackAdapter trackAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_tracks,viewGroup,false);

        // More information about RecyclerView at https://developer.android.com/training/material/lists-cards.html
        recyclerView = (RecyclerView) rootView.findViewById(R.id.track_recyclerView);
        // size wont change based on size of child items. set it true for optimization since thats our case
        recyclerView.setHasFixedSize(true);
        // we will have a linear list
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // fetch the songs in background
        new loadTracks().execute("");

        return rootView;
    }


    private class loadTracks extends AsyncTask<String, Void, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(String s) {
            recyclerView.setAdapter(trackAdapter);
        }

        @Override
        protected String doInBackground(String... params) {
            if (getActivity() != null)
                trackAdapter = new TrackAdapter(getActivity(), TrackLoader.getAllTracks(getActivity()));
            return "Executed";
        }
    }
}
