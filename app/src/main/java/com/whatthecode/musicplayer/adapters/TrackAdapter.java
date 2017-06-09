package com.whatthecode.musicplayer.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.whatthecode.musicplayer.models.Track;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nipun Haldar on 6/8/2017.
 */

public class TrackAdapter extends RecyclerView.Adapter<TrackAdapter.ItemHolder> {

    private Context context;
    private ArrayList<Track> tracks;

    public TrackAdapter(Context _context, ArrayList<Track> _tracks) {
        this.context = _context;
        this.tracks = _tracks;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        public ItemHolder(View itemView) {
            super(itemView);
        }
    }
}
