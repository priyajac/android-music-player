package com.whatthecode.musicplayer.models;

/**
 * Created by Nipun Haldar on 6/8/2017.
 */

public class Track {

    private long mID;
    private String mTrackName;
    private String mArtistName;

    public Track(long ID, String trackName, String artistName){
        mID = ID;
        mTrackName = trackName;
        mArtistName = artistName;
    }

    public long getID(){
        return mID;
    }

    public String getTrack(){
        return mTrackName;
    }

    public String getArtist(){
        return mArtistName;
    }
}
